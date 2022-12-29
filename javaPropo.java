package com.JavaException;

public class javaPropo {
	{
		System.out.println("MANIHS");
	}
static void m2() {
	m1();
}
	
	
	
	 static void m1() {
	//System.out.println(34/0);
	try {
		System.out.println(34/0);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
	 static void m3() {
		 m2();
	 }
	 static void m4() {
		 m3();
	 }



	public static void main(String[] args) {
	m4();
	System.out.println("mANISH");
}
}
