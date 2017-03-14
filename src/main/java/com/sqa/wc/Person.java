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

public class Person {

	private String name;
	private String favoriteColor;
	private char gender;
	private double height;
	private boolean isTired;

	public Person() {
		this.name = "Abc";
		this.favoriteColor = "Black";
	}

	public Person(String name, String favoriteColor) {
		this.name = name;
		this.favoriteColor = favoriteColor;
	}

	public String getName() {
		return this.name;
	}

	public String setName() {
		return this.name;
	}

	public void sleep() {
		System.out.println(getName() + " is fast asleep...ZZzzZZzz");
	}

	@Override
	public String toString() {
		return "[" + this.name + " who's favorite color is " + this.favoriteColor + "]";
	}

}
