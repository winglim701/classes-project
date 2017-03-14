/**
 *   File Name: Pet.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 13, 2017
 *
 */

package com.sqa.wc;

/**
 * Pet //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chan, William
 * @version 1.0.0
 * @since 1.0
 *
 */
public class Pet {

	/*
	 * Create a Pet class. Create the variables type, name, age, hasRabies,
	 * petCosts, and gender for the Pet Class. Create a constructor which
	 * assigns default values for the Pet class. Override the toString method
	 * with more meaningful output (Use option in Menu, Source > Generate
	 * toString(). Create the methods makeSound(), eat(), and move() using
	 * System.out calls to console.
	 */

	private String name;
	private int age;
	private Boolean hasRabies;
	private float petCosts;
	private char gender;

	public Pet() {
		this.name = "Meow";
		this.age = 16;
		this.hasRabies = false;
		this.petCosts = 45;
		this.gender = 'M';

	}

	public Pet(String name, int age, Boolean hasRabies, float petCosts, char gender) {
		this.name = name;
		this.age = age;
		this.hasRabies = hasRabies;
		this.petCosts = petCosts;
		this.gender = gender;
	}

	public void eat() {
		if (getAge() <= 9) {
			System.out.println(getName() + " is getting two cups of food.");
		} else {
			System.out.println(getName() + " is getting one cup of food.");
		}
	}

	public int getAge() {
		return this.age;
	}

	public char getGender() {
		return this.gender;
	}

	public String getName() {
		return this.name;
	}

	public Boolean hasRabies() {
		return this.hasRabies;
	}

	public void makeSound() {
		if (getGender() == 'M') {
			System.out.println("Meow");
		} else {
			System.out.println("Meow Meow Meow");
		}
	}

	public void move() {
		if (hasRabies() == true) {
			System.out.println(getName() + " is not moving....");
		} else {
			System.out.println(getName() + " is moving.");
		}
	}

	public String setName() {
		return this.name;
	}

	@Override
	public String toString() {
		return "Pet [name=" + this.name + ", age=" + this.age + ", hasRabies=" + this.hasRabies + ", petCosts="
				+ this.petCosts + ", gender=" + this.gender + "]";
	}

}
