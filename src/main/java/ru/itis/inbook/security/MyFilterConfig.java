package ru.itis.inbook.security;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.itis.inbook.filter.MyFilter;

@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean<MyFilter> filter(){
        FilterRegistrationBean<MyFilter> regBean = new FilterRegistrationBean<>();

        regBean.setFilter(new MyFilter());
        regBean.addUrlPatterns("/users");
        return regBean;
    }
}
