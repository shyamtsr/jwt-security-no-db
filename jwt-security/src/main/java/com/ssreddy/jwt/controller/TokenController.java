package com.ssreddy.jwt.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssreddy.jwt.model.JwtUser;
import com.ssreddy.jwt.security.JwtGenerator;

@RestController
@RequestMapping("/token")
public class TokenController {

	private JwtGenerator jwtGenerator;
	
	public TokenController(JwtGenerator jwtGenerator) {
		super();
		this.jwtGenerator = jwtGenerator;
	}

	@PostMapping
	public String generate(@RequestBody final JwtUser jwtUser) {
		return jwtGenerator.generate(jwtUser);
	}
	
}
