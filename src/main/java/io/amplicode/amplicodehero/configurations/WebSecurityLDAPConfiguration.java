package io.amplicode.amplicodehero.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.support.BaseLdapPathContextSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.ldap.LdapBindAuthenticationManagerFactory;
import org.springframework.security.ldap.DefaultSpringSecurityContextSource;
import org.springframework.security.ldap.authentication.NullLdapAuthoritiesPopulator;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityLDAPConfiguration {

    private final String ldapUrl;
    private final String ldapUserDnPatterns;

    public WebSecurityLDAPConfiguration(@Value("${amplicode-hero.ldap.url}") String ldapUrl,
                                        @Value("${amplicode-hero.ldap.userDnPatterns}") String ldapUserDnPatterns) {
        this.ldapUrl = ldapUrl;
        this.ldapUserDnPatterns = ldapUserDnPatterns;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
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
    BaseLdapPathContextSource contextSource() {
        return new DefaultSpringSecurityContextSource(ldapUrl);
    }

    @Bean
    LdapAuthoritiesPopulator ldapAuthoritiesPopulator() {
        return new NullLdapAuthoritiesPopulator();
    }

    @Bean
    AuthenticationManager ldapAuthenticationManager() {
        LdapBindAuthenticationManagerFactory factory = new LdapBindAuthenticationManagerFactory(contextSource());
        factory.setUserDnPatterns(ldapUserDnPatterns);
        factory.setLdapAuthoritiesPopulator(ldapAuthoritiesPopulator());
        return factory.createAuthenticationManager();
    }
}