package ru.itis.inbook.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.itis.inbook.dto.SignUpDto;
import ru.itis.inbook.models.Role;
import ru.itis.inbook.models.User;
import ru.itis.inbook.repository.UserRepository;
import ru.itis.inbook.security.UserDetailsImpl;

import java.util.UUID;
import java.util.concurrent.ExecutorService;

@Service
public class ProfileChangeServiceImp implements ProfileChangeService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void update(SignUpDto form) {

        User user = User.builder()
                .login(form.getLogin())
                .email(form.getEmail())
                .hashPassword(passwordEncoder.encode(form.getPassword()))
                .role(Role.USER)
                .confirmCode(UUID.randomUUID().toString())
                .build();

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String currentPrincipalName = authentication.getName();

//        User oldUser = userRepository.findById(12);
//        userRepository.delete(oldUser);
//        if (user.getLogin() != null)  oldUser.setLogin(user.getLogin());
//        if ((user.getEmail() != null) && SignUpServiceImpl.checkEmail(user.getEmail())) oldUser.setEmail(user.getEmail());
//        if (user.getHashPassword() != null) oldUser.setHashPassword(user.getHashPassword());
//        userRepository.save(oldUser);



    }
}
