package com.plakhotnyuk.manager.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.plakhotnyuk.manager.bean.Users;

public class UsersDAOImpl implements UsersDAO {

	public void addUsers(Users users) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthdb","root","1234");
				PreparedStatement ps = connection.prepareStatement(
						"INSERT INTO users(email, first_name, second_name, password)VALUES (?,?,?,?);")) {
			ps.setString(1, users.getEmail());
			ps.setString(2, users.getFirstName());
			ps.setString(3, users.getSecondName());
			ps.setString(4, users.getPassword());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Users loginUsers(String email, String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		}catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthdb","root","1234");
				PreparedStatement ps = connection.prepareStatement(
						"SELECT * FROM users WHERE email = ? AND password =?;")) {
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Users users = new Users(rs.getInt("id"), rs.getString("email"), rs.getString("first_name"), 
						rs.getString("second_name"), rs.getString("password"));
				return users;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
