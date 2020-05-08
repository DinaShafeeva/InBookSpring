package ru.itis.inbook.service;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.context.annotation.RequestScope;
import ru.itis.inbook.dto.SignUpDto;
import ru.itis.inbook.models.Role;
import ru.itis.inbook.models.User;
import ru.itis.inbook.repository.UserRepository;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

@Component
@RequestScope
public class SignUpServiceImpl implements SignUpService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EmailService emailService;

    @Autowired
    private ExecutorService executorService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private Configuration freemarkerConfig;


    @Override
    public boolean signUp(SignUpDto form) {
        if (checkEmail(form.getEmail()) && checkPassword(form.getPassword())) {
            User user = User.builder()
                    .login(form.getLogin())
                    .email(form.getEmail())
                    .hashPassword(passwordEncoder.encode(form.getPassword()))
                    .role(Role.NOTUSER)
                    .confirmCode(UUID.randomUUID().toString())
                    .build();

            userRepository.save(user);

            Template t = null;
            Map model = new HashMap();
            model.put("username", user.getEmail());
            model.put("link", "localhost/confirm/" + user.getConfirmCode());
            try {
                t = freemarkerConfig.getTemplate("mail-temp.ftl");
                String html = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);
                executorService.submit(() ->
                        emailService.sendMail("Confirm", html, user.getEmail()));
            } catch (IOException e) {
                throw new IllegalStateException(e);
            } catch (TemplateException e) {
                throw new IllegalArgumentException(e);
            }

//        executorService.submit(() ->
//                emailService.sendMail("Confirm", user.getConfirmCode(), user.getEmail()));

            return true;
        } else return false;
    }

    @Override
    public void signUpWithGoogle(String email) {

    }

    static boolean checkPassword(String password) {
        if (password.length() > 5) {
            return contains("[0-9a-z]+", password);
        } else return false;
    }

    static boolean checkEmail(String email) {

        String string = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        return contains(string,email);
    }


    private static boolean contains(String pattern, String content) {
        return content.matches(pattern);
    }

}
