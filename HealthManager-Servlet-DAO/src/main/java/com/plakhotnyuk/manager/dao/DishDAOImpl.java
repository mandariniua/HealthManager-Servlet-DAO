package com.plakhotnyuk.manager.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.plakhotnyuk.manager.bean.Dish;

public class DishDAOImpl implements DishDAO {

	@Override
	public List<Dish> allViewDish() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		ArrayList<Dish> dishList = new ArrayList<>();
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/healthdb", "root",
				"1234"); Statement statment = connection.createStatement();) {
			ResultSet rs = statment.executeQuery("SELECT id, name_dish, kcal from dish;");

			while (rs.next()) {
				int id = rs.getInt("id");
				String dishName = rs.getString("name_dish");
				int kcal = rs.getInt("kcal");
				dishList.add(new Dish(id, dishName, kcal));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dishList;
	}

}
