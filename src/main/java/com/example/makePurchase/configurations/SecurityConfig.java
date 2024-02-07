package com.example.makePurchase.configurations;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
<<<<<<< HEAD
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
=======
>>>>>>> d4ea42b75cec86a30116a12fb6907119171c636c
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
<<<<<<< HEAD
@EnableGlobalMethodSecurity(prePostEnabled = true)
=======
>>>>>>> d4ea42b75cec86a30116a12fb6907119171c636c
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((requests) -> requests
<<<<<<< HEAD
                        .requestMatchers("/","/product/**", "/images/**", "/registration", "/user/**")
=======
                        .requestMatchers("/","/product/**", "/images/**", "/registration")
>>>>>>> d4ea42b75cec86a30116a12fb6907119171c636c
                        .permitAll().anyRequest().authenticated() ) .
                formLogin((form) -> form.loginPage("/login").permitAll() ) .logout((logout) -> logout.permitAll());
        return http.build();
    }
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(8);
    }
}