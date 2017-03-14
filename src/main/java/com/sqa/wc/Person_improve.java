/**
 *   File Name: Person.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 11, 2017
 *
 */

package com.sqa.wc;

public class Person_improve {

	private String name;
	private String favoriteColor;
	private char gender;
	private double height;
	private boolean isTired;

	public Person_improve() {
		super();
		this.name = "Unknown";
		this.gender = 'M';
		this.height = 6.0;
		this.favoriteColor = "blue";
		this.isTired = true;
	}

	public Person_improve(String name, char gender, double height, String favoriteColor) {
		this(name, favoriteColor);
		this.gender = gender;
		this.height = height;
	}

	public Person_improve(String name, char gender, double height, String favoriteColor, boolean isTired) {
		super();
		this.name = name;
		this.gender = gender;
		this.height = height;
		this.favoriteColor = favoriteColor;
		this.isTired = isTired;
	}

	public Person_improve(String name, String favoriteColor) {
		this();
		this.name = name;
		this.favoriteColor = favoriteColor;
	}

	public String getFavoriteColor() {
		return this.favoriteColor;
	}

	public char getGender() {
		return this.gender;
	}

	public double getHeight() {
		return this.height;
	}

	public String getName() {
		return this.name;
	}

	public boolean isTired() {
		return this.isTired;
	}

	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setTired(boolean isTired) {
		this.isTired = isTired;
	}

	public void sleep() {
		System.out.println(getName() + " is fast asleep...ZZzzZZzz");
	}

	@Override
	public String toString() {
		return "Person [name=" + this.name + ", gender=" + this.gender + ", height=" + this.height + ", favoriteColor="
				+ this.favoriteColor + ", isTired=" + this.isTired + "]";
	}

}
