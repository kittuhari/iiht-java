package com.springboot.studentdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


//@Configuration
//@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication().withUser("kittu").password("{noop}1234").roles("USER");
		
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
			http.httpBasic().and().authorizeRequests().antMatchers(HttpMethod.GET, "/home").hasRole("USER").and().csrf().disable().formLogin().disable();
		
	}
	
	
	

}
