package com.estudio.easyParking.util;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * BasicConfiguration
 */

public class BasicConfiguration extends WebSecurityConfigurerAdapter{

    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable();

        http.authorizeRequests().anyRequest().authenticated().and().formLogin().and().httpBasic();
    }

    
}