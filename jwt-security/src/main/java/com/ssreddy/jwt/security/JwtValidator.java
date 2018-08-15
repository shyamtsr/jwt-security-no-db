package com.ssreddy.jwt.security;

import org.springframework.stereotype.Component;

import com.ssreddy.jwt.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

@Component
public class JwtValidator {

	private String secret = "youtube";

	public JwtUser validate(String token) {
		JwtUser jwtUser= null;
		try {
		Claims body=  Jwts.parser()
				.setSigningKey(secret)
				.parseClaimsJws(token)
				.getBody();
		
		jwtUser = new JwtUser();
		jwtUser.setUserName(body.getSubject());
		jwtUser.setUserId(Long.parseLong((String)body.get("userId")));
		jwtUser.setRole((String)body.get("role"));
		}catch(Exception e) {
			e.printStackTrace();
		}
		return jwtUser;
	}

}
