package ru.itis.inbook.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.List;


@EnableGlobalMethodSecurity(
        prePostEnabled = true,
        securedEnabled = true,
        jsr250Enabled = true)
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    @Qualifier(value = "customUserDetailsService")
    private UserDetailsService userDetailsService;

    @Autowired
    private AuthHandler authHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.authorizeRequests()
              //  .antMatchers("/users").hasAuthority("ADMIN")
    //            .antMatchers("/users").authenticated()
                .antMatchers("/").authenticated()
                .antMatchers("/profile").authenticated()
                .antMatchers("/search").authenticated()
                .antMatchers("/profileChange").authenticated()
                .antMatchers("/signUp").permitAll()
                .antMatchers("/confirm/**").permitAll();

        http.formLogin()
                .loginPage("/signIn")
                .defaultSuccessUrl("/profile")
                .failureUrl("/signIn?error")
                .usernameParameter("email")
                .permitAll();

        http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/signIn")
                .deleteCookies("SESSION", "remember-me")
                .invalidateHttpSession(true);

   //     http.oauth2Login().successHandler(authHandler);

    }


    @Autowired
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
    }


//    @Bean
//    public ClientRegistrationRepository clientRegistrationRepository(){
//        List<ClientRegistration> registrations;
//        return new InMemoryClientRegistrationRepository(registrations);
//    }
//
//    public ClientRegistration getRegistration(){
//        String clientId = "917317696983-g0dodg6no42m2t2g2vq95h5sbhp59frn.apps.googleusercontent.com";
//        String clientSecret = "9-mR_lud80nEpQ8tSYSKVE4X";
//    }
}
