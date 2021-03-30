package com.faith.travel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.faith.travel.entity.Login;
import com.faith.travel.repo.ILoginRepo;

@Service
public class LoginService implements ILoginService{

	@Autowired
	private ILoginRepo loginRepo;
	
	@Override
	public List<Login> findAll(){
		return (List<Login>) loginRepo.findAll();
	}
	
	
	@Transactional
	@Override
	public Login insertUser(Login login) {
		loginRepo.save(login);
		return login;
	}
	
	@Transactional
	@Override
	public Login updateUser(Login login) {
		loginRepo.save(login);
		return login;
	}
	
	@Override
	public Login findUserByNameAndPassword(String username, String password) {
		
		Login user = loginRepo.findByUsernameAndPassword(username, password);
		
		if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
			return user;
			
		} else {
			
			return null;
		}
	}
}
