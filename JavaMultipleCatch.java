package com.JavaException;
public class JavaMultipleCatch {
public static void main(String[] args) {
	try {
		int a[]=new int[5];
		a[5]=10/0;
		
	} catch (ArithmeticException e) {
	 System.out.println("our exception will hendle"); 
	System.out.println(e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("our exeption will hendle");
		System.out.println(e);
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
}
