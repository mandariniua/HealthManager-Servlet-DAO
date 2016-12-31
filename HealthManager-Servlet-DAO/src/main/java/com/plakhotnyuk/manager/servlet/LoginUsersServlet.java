package com.plakhotnyuk.manager.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.plakhotnyuk.manager.bean.Users;
import com.plakhotnyuk.manager.dao.UsersDAO;
import com.plakhotnyuk.manager.dao.UsersDAOImpl;


public class LoginUsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Users users = new UsersDAOImpl().loginUsers(request.getParameter("email"), request.getParameter("password"));
		if(users!= null) {
			if(request.getParameter("email").equals(users.getEmail()) && request.getParameter("password").equals(users.getPassword())) {
				request.getSession().setAttribute("users", users);
				request.getSession().setAttribute("email", users.getEmail());
				response.getWriter().write("nice");
				return;
			} else {
				request.setAttribute("wrong", "Wrong password");
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
				return;
			} 
		} else {
			request.setAttribute("message", "User not found");
			getServletContext().getRequestDispatcher("/addUsers.jsp").forward(request, response);
			return;
		}
	}

}
