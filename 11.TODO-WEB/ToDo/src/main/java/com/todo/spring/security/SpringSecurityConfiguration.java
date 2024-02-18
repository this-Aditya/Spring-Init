package com.todo.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager createUserDeatilsManager() {
        UserDetails userDetails = getUserDetails("Aditya", "pass");
        UserDetails userDetails2 = getUserDetails("Abhay", "pass");
        UserDetails userDetails3 = getUserDetails("Aditi", "pass");

        return  new InMemoryUserDetailsManager(userDetails,userDetails2,userDetails3);
    }

    private UserDetails getUserDetails(String username, String pwd) {
        return User.builder()
                .passwordEncoder(password -> passwordEncoder().encode(password))
                .username(username)
                .password(pwd)
                .roles("USER", "ADMIN")
                .build();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
