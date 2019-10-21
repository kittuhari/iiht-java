package com.springboot.studentdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class FormSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("kittu").password("{noop}1234").authorities("ROLE_USER").and().withUser("kumar").password("{noop}5678").authorities("ROLE_ADMIN");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/admin").hasRole("ADMIN").antMatchers("/student").hasRole("USER").anyRequest().authenticated().and().formLogin().permitAll();
		http.csrf().disable();
		
		
	}

}
