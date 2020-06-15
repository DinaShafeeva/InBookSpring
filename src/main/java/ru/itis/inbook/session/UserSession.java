package ru.itis.inbook.session;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import ru.itis.inbook.models.User;
import ru.itis.inbook.security.UserDetailsImpl;
import ru.itis.inbook.service.UserServiceImpl;

import java.io.Serializable;

@Component
@SessionScope
public class UserSession implements Serializable {

    private User user;

    public User getUser() {
        if (user == null){
             user = ((UserDetailsImpl)SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUser();
        }
        return user;
    }
}
