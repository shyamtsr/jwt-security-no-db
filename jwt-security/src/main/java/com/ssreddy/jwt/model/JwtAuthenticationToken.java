package com.ssreddy.jwt.model;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class JwtAuthenticationToken extends UsernamePasswordAuthenticationToken{

	private String token;
	
	public JwtAuthenticationToken(String token) {
		super(null, null);
		this.token=token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	public String getToken() {
		return token;
	}
	
	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
