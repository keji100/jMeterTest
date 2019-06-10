package com.login.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.login.domain.LoginVoImpl;
import com.login.service.LoginService;

@RestController
@RequestMapping(value="/login")
public class LoginResource {

	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<LoginVoImpl> find(@PathVariable Integer id){
		LoginVoImpl obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<String> logar(@RequestBody LoginVoImpl vo){
		LoginVoImpl obj = service.findByOne(vo);
		if(obj != null) {
			return ResponseEntity.ok().body("LOGIN VÁLIDO!");
		}else {
			return ResponseEntity.ok().body("LOGIN INVÁLIDO!");
		}
	}
}
