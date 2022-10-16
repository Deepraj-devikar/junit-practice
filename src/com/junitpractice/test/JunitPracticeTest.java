package com.junitpractice.test;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import com.junitpractice.JunitPractice;

/* Steps to create Parameterized test cases :-
 * 1) Create Test Class
 * 2) add annotation @RunWith(Parameterized.class) to the class
 * 3) create instance variables for inputs and outputs of our method which have to test
 * 4) create object of class that we have to test as instance variable
 * 5) initialize our input and output variables in constructor
 * 6) create static function which return collection of 2D array of Object
 * 7) write test cases according to our instance variables
 */

@RunWith(Parameterized.class)
public class JunitPracticeTest {
	// inputs of addition method
	private int a;
	private int b;
	
	// outputs of addition method
	private long out;
	
	private JunitPractice junitPractice = new JunitPractice();
	
	public JunitPracticeTest(int a, int b, long out) {
		this.a = a;
		this.b = b;
		this.out = out;
	}
	
	@Parameterized.Parameters
	public static Collection testCases() {
		return Arrays.asList(new Object[][] {
			{4, 9, 13},
			{2, 6, 8},
			{7, 5, 11}
		});
	}
	
	@Test
	public void test() {
		long result = junitPractice.addition(a, b);
		Assert.assertEquals(result, out);
	}

}
