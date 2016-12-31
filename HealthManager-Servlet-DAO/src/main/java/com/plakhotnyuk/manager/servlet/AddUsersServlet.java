package com.plakhotnyuk.manager.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.plakhotnyuk.manager.bean.Users;
import com.plakhotnyuk.manager.dao.UsersDAO;
import com.plakhotnyuk.manager.dao.UsersDAOImpl;


public class AddUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Users users = new Users();
		
		users.setEmail(request.getParameter("email"));
		users.setFirstName(request.getParameter("firstName"));
		users.setSecondName(request.getParameter("secondName"));
		users.setPassword(request.getParameter("password"));
		
		UsersDAO userDao = new UsersDAOImpl();
		userDao.addUsers(users);
		response.getWriter().write("susecufull");
	}

}
