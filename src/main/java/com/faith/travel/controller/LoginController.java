package com.faith.travel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faith.travel.entity.Login;
import com.faith.travel.service.ILoginService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class LoginController {

	@Autowired
	private ILoginService loginService;

	@GetMapping("users")
	public List<Login> findAllUsers() {
		return loginService.findAll();
	}

	@PostMapping("users/add")
	public ResponseEntity<Login> insertUser(@RequestBody Login user) {
		System.out.println("inserting");

		return new ResponseEntity<Login>(loginService.insertUser(user), HttpStatus.OK);
	}

	@PutMapping("users/update")
	public Login updateUser(@RequestBody Login user) {

		loginService.updateUser(user);
		return user;
	}

	@GetMapping("user-login/{username}&{password}")
	public Login findUserByNameAndPassword(@PathVariable String username, @PathVariable String password) {

		System.out.println("inside controller");
		return loginService.findUserByNameAndPassword(username, password);
	}
}
