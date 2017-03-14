package com.sqa.wc;

import org.junit.*;

public class PetTest {

	@Test
	public void test1() {
		Pet one = new Pet("Meow", 16, false, 100, 'M');
		System.out.println("Pet:" + one.toString());
		one.makeSound();
		one.eat();
		one.move();
	}

	@Test
	public void test2() {
		Pet two = new Pet("JC", 12, false, 80, 'M');
		System.out.println("Pet:" + two.toString());
		two.makeSound();
		two.eat();
		two.move();
	}

	@Test
	public void test3() {
		Pet three = new Pet("Fusi", 2, true, 60, 'F');
		System.out.println("Pet:" + three.toString());
		three.makeSound();
		three.eat();
		three.move();
	}

}
