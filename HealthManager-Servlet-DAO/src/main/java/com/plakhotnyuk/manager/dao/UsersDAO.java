package com.plakhotnyuk.manager.dao;

import com.plakhotnyuk.manager.bean.Users;

public interface UsersDAO {
	
	public void addUsers(Users users);
	public Users loginUsers (String email, String password);

}
