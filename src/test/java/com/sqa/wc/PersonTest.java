/**
 *   File Name: PersonTest.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 11, 2017
 *
 */

package com.sqa.wc;

import org.junit.*;

/**
 * PersonTest //ADDD (description of class)
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
public class PersonTest {

	@Test
	public void test1() {
		Person_improve wc = new Person_improve("William", 'M', "orange", 6.0);
		System.out.println("Person:" + wc.toString());
		wc.sleep();
	}

	@Test
	public void test2() {
		Person_improve helen = new Person_improve("Helen", 'F', "Purple", 5.2);
		System.out.println("Person:" + helen);
		helen.sleep();
	}

	@Test
	public void test3() {
		Person_improve peggy = new Person_improve("Peggy", 'F', "Blue", 5.0);
		System.out.println("Person:" + peggy);
		peggy.sleep();
	}

	@Test
	public void test4() {
		Person_improve kanffee = new Person_improve("Kanffee", 'F', "Pink", 5.6);
		System.out.println("Person:" + kanffee);
		kanffee.sleep();
	}

	@Test
	public void test5() {
		Person_improve elaine = new Person_improve("Elanie", 'F', "Black", 5.4);
		System.out.println("Person:" + elaine);
		elaine.sleep();
	}

	@Test
	public void test6() {
		Person_improve michelle = new Person_improve("Michelle", 'F', "Gray", 5.6);
		System.out.println("Person:" + michelle);
		michelle.sleep();
	}

	@Test
	public void test7() {
		Person defaultPerson = new Person();
		System.out.println("Person:" + defaultPerson);
		System.out.println(defaultPerson.getName() + " like to sleep.");
		defaultPerson.sleep();
	}
}
