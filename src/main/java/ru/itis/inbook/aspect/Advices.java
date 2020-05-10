package ru.itis.inbook.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Advices {
    @Before(value= "execution(* ru.itis.inbook.service.SignUpServiceImpl.signUp(..))")
    public void logSignUp(JoinPoint jp){
        System.out.println("Try to sign up");
    }

    @Before(value= "execution(* ru.itis.inbook.service.ConfirmServiceImpl.confirm(..))")
    public void logConfirm(JoinPoint jp){
        System.out.println("Try to confirm");
    }

    @Around(value= "execution(* ru.itis.inbook.service.ProfileChangeServiceImp.update(..))")
    public void logUpdate(JoinPoint jp){
        System.out.println("Try to update profile data");
    }
}
