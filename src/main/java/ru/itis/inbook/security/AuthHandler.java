package ru.itis.inbook.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.core.oidc.user.DefaultOidcUser;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;
import ru.itis.inbook.service.SignUpService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthHandler extends SimpleUrlAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Autowired
    SignUpService signUpService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpRequest, HttpServletResponse httpServletResponse, Authentication authentication){
        signUpService.signUpWithGoogle(((DefaultOidcUser)authentication.getPrincipal()).getEmail());
    }

}
