package ru.itis.inbook.security;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itis.inbook.scopes.MyScopeFactory;

@Configuration
public class MyScopeConfig {

    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor() {
        return new MyScopeFactory();
    }
}