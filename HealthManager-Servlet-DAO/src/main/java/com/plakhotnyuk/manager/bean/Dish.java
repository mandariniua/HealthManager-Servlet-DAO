package com.plakhotnyuk.manager.bean;

public class Dish {

	private int id;
	private String dishName;
	private int kcal;

	public Dish() {

	}

	public Dish(int id, String dishName, int kcal) {
		this.id = id;
		this.dishName = dishName;
		this.kcal = kcal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", dishName=" + dishName + ", kcal=" + kcal + "]";
	}

}
