package com.ssreddy.jwt.security;

import org.springframework.stereotype.Component;

import com.ssreddy.jwt.model.JwtUser;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtGenerator {

	public String generate(JwtUser jwtUser) {
//		Claims claims=Jwts.builder().setExpiration(exp)
		Claims claims=Jwts.claims()
				.setSubject(jwtUser.getUserName());
		claims.put("userId", String.valueOf(jwtUser.getUserId()));
		claims.put("role", jwtUser.getRole());
		
		 return Jwts.builder().setClaims(claims)
		.signWith(SignatureAlgorithm.HS512, "youtube")
		.compact();
		
	}

}
