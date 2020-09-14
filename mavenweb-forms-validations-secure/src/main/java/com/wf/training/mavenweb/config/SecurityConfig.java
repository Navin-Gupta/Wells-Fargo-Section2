package com.wf.training.mavenweb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	// to configure the credential repository
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// in memory authentication
		// create user
		UserBuilder builder =  User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
			.withUser(builder.username("First").password("abc").roles("REGISTERED"))
			.withUser(builder.username("Second").password("abc").roles("REGISTERED","STUDENT"))
			.withUser(builder.username("Third").password("abc").roles("REGISTERED","MENTOR"));
	}
	
	// to define the rule of access
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests() // start defining the rule
			.anyRequest()
			.authenticated()
		.and() // how auth should take place
			// .httpBasic()
			.formLogin() // form-based auth
			.loginPage("/custom-login") // custom login form
			.loginProcessingUrl("/validate") // implementation is provided free
			.permitAll(); // allow to access login form
			
	}
	
	
	// third party JWT Token/OAuth
	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		super.configure(web);
	}
}

