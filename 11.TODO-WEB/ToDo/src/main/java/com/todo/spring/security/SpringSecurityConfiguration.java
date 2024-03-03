package com.todo.spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    public InMemoryUserDetailsManager createUserDeatilsManager() {
        UserDetails userDetails = getUserDetails("Aditya", "pass");
        UserDetails userDetails2 = getUserDetails("Abhay", "pass");
        UserDetails userDetails3 = getUserDetails("Aditi", "pass");
        UserDetails userDetails4 = getUserDetails("Ujjawal", "pass");

        return  new InMemoryUserDetailsManager(userDetails,userDetails2,userDetails3, userDetails4);
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

    /*
        By default Spring Security provides:
        Protection of all urls
        A login form is shown for unauthorized requests
        CSRF disable
        Use of Frames is also disabled in html
     */

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(auth -> auth.anyRequest().authenticated());
        http.formLogin(Customizer.withDefaults());
        http.csrf(csrf -> csrf.disable());
        http.headers(header -> header.frameOptions(frameOptions -> frameOptions.disable()));

        return http.build();
    }
}
