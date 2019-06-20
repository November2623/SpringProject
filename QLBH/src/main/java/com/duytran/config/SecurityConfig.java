package com.duytran.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().passwordEncoder(passwordEncoder())
                .withUser("admin").password("$2a$04$Q2Cq0k57zf2Vs/n3JXwzmerql9RzElr.J7aQd3/Sq0fw/BdDFPAj.").roles("ADMIN");
        auth.inMemoryAuthentication().passwordEncoder(passwordEncoder())
                .withUser("user").password("$2a$04$Q2Cq0k57zf2Vs/n3JXwzmerql9RzElr.J7aQd3/Sq0fw/BdDFPAj.").roles("USER");
        //auth.inMemoryAuthentication().passwordEncoder(NoOpPasswordEncoder.getInstance()).withUser("sena").password("123456").roles("USER");
    }

    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests().antMatchers("/", "/login").permitAll();
        http.authorizeRequests().antMatchers("/Admin/**", "/Customers", "/Providers","/History").access("hasRole('ROLE_ADMIN')");
        http.authorizeRequests().antMatchers("/UserPage").access("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')");
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403");


        http.authorizeRequests().and()
                //cau hinh cho form login
                .formLogin()
                .loginProcessingUrl("/security_login")
                .loginPage("/login")
                .defaultSuccessUrl("/UserPage")
                .failureUrl("/login?message=error")
                .usernameParameter("username")
                .passwordParameter("password")
                .and()
                // cau hinh cho logout
                .logout()
                .logoutUrl("/secutiry_logout")
                .logoutSuccessUrl("/login?message=logout");
    }
}
