package io.amplicode.amplicodehero.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.mapping.GrantedAuthoritiesMapper;
import org.springframework.security.web.SecurityFilterChain;

import java.util.HashSet;
import java.util.Set;

@Configuration
@Import({WebSecurityJwtConfiguration.class, KafkaConfiguration.class})
@EnableWebSecurity
public class WebSecurityOAuth2Configuration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        //OAuth 2.0 Login
        http.oauth2Login(Customizer.withDefaults());
        http.logout(Customizer.withDefaults());
        //Authorize Requests
        http.authorizeHttpRequests(authorizeHttpRequests -> authorizeHttpRequests
                .anyRequest().authenticated());
        //Headers management
        http.headers(Customizer.withDefaults());
        //Anonymous
        http.anonymous(Customizer.withDefaults());
        //CSRF
        http.csrf(Customizer.withDefaults());
        return http.build();
    }

    @Bean
    public GrantedAuthoritiesMapper userAuthoritiesMapper() {
        return (authorities) -> {
            Set<GrantedAuthority> mappedAuthorities = new HashSet<>();
            authorities.forEach(authority -> {
                //TODO Map roles
//				if (authority instanceof OidcUserAuthority){
//					OidcUserAuthority oidcUserAuthority = (OidcUserAuthority) authority;
//					JSONArray keycloakRoles = (JSONArray) oidcUserAuthority.getAttributes().get("roles");
//					keycloakRoles.forEach(role -> mappedAuthorities.add(new SimpleGrantedAuthority((String) role)));
//				} else {
//					mappedAuthorities.add(authority);
//				}
            });
            return mappedAuthorities;
        };
    }
}