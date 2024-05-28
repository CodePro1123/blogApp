/*
package com.blog.app.BlogApp.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class Securities extends WebSecurityConfigurerAdapter {

    //override configure method;

   protected void configure(HttpSecurity httpSecurity) throws Exception {
       httpSecurity
               .csrf().disable()
               .authorizeRequests()
               .anyRequest()
               .authenticated()
               .and()
               .httpBasic(); //form based configuration change to basic authentication.
   }

}
*/
