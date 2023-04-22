package com.app;

/*
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.StaticHeadersWriter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
public class SecurityConfig {

    @Value("${spring.security.debug:false}")
    boolean securityDebug;

   @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
     http.csrf()
          //.disable()
          .and()
          .authorizeRequests()
          .antMatchers("*")
          .hasRole("ADMIN")
          .antMatchers("/admin/**", "/greeting/**")
          
          .hasAnyRole("ADMIN")
          .antMatchers("/user/**")
          
          .hasAnyRole("USER", "ADMIN")
          .antMatchers("/login/**", "/api/**")
          
          
          .anonymous()
          .antMatchers("/**","/api/employeeCustomAPI/employeegetall","/index.html", "/logout.html","/login.html").permitAll() //"anonymous()" has same result
          
          .anyRequest()
          
          .authenticated()
          .and()
          .httpBasic()
          .and()
          .sessionManagement()
          .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        
          http.headers().addHeaderWriter(
                new StaticHeadersWriter("Access-Control-Allow-Origin", "*"));

        return http.build();
    }
    

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.debug(securityDebug)
          .ignoring()
          .antMatchers("/css/**", "/js/**", "/img/**", "/lib/**", "/favicon.ico");
    }
      
} */