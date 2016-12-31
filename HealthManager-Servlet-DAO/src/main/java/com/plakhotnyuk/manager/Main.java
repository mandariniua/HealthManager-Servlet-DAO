package com.plakhotnyuk.manager;

import com.plakhotnyuk.manager.bean.Users;
import com.plakhotnyuk.manager.dao.UsersDAOImpl;

public class Main {

	public static void main(String[] args) {
		Users u = new UsersDAOImpl().loginUsers("alfred@gmail.com", "1234");
		System.out.println(u);

	}

}
