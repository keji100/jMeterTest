package com.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.domain.LoginVoImpl;
import com.login.repository.LoginRepository;
import com.login.service.exceptions.ObjectNotFoundException;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository repo;
	
	public LoginVoImpl find(Integer id) {
		Optional<LoginVoImpl> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: "+id+", Tipo: "+ LoginVoImpl.class.getName()));
	}
	
	public LoginVoImpl findByOne(LoginVoImpl vo) {
		LoginVoImpl obj = repo.findUserLogin(vo.getLogin(), vo.getSenha());
		if(obj != null) {
			return obj;
		}else {
			return null;
		}
	}
	
}
