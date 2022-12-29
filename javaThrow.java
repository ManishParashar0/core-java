package com.JavaException;

public class javaThrow {
	static void m1(int age) {
		if (age < 18) {
			//throw new NullPointerException("wrong its wrong");
		} else {
			System.out.println("yes its right");
		}
	}

	public static void main(String args[]) {
try {
	m1(13);
} catch (Exception e) {
	System.out.println(e);
}
		
		System.out.println("hello");
	}
   
}
