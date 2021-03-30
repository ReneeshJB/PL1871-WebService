package com.faith.travel.service;

import java.util.List;

import com.faith.travel.entity.Login;

public interface ILoginService {

	public List<Login> findAll();

	public Login insertUser(Login login);

	public Login updateUser(Login login);

	public Login findUserByNameAndPassword(String username, String password);

}
