package com.learnsecurity.impl.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {
	
	public UserDetails loadUserByUsername(String s)throws UsernameNotFoundException
	{
		return new org.springframework.security.core.userdetails.User("admin","password",new ArrayList<>());
	}
	
	

}
