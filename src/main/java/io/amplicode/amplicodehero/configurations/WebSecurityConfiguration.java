package io.amplicode.amplicodehero.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //Authorize Requests
        http.authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests
                .anyRequest().authenticated());
        //Headers management
        http.headers(Customizer.withDefaults());
        //Session management
        http.sessionManagement(Customizer.withDefaults());
        //Form login
        http.formLogin(Customizer.withDefaults());
        //Anonymous
        http.anonymous(Customizer.withDefaults());
        //CSRF
        http.csrf(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public UserDetailsService inMemoryUserDetailsService() {
        // The builder will ensure the passwords are encoded before saving in memory
        User.UserBuilder users = User.withDefaultPasswordEncoder();
        InMemoryUserDetailsManager userDetailsManager = new InMemoryUserDetailsManager();
        userDetailsManager.createUser(users.username("admin")
                .password("admin")
                .roles("ADMIN")
                .build());
        userDetailsManager.createUser(users.username("user")
                .password("user")
                .roles("USER")
                .build());
        return userDetailsManager;
    }
}