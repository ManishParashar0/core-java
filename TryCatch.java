package com.JavaException;

public class TryCatch {
	public static void main(String[] args) {
		System.out.println("our start...");
		int a = 12;
		int b = 0;
		try {
			int c = a / b;
			System.out.println(c);
		} /*
			 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
			 * Java/com.JavaException.TryCatch.main(TryCatch.java:10)
			 */
		catch (ArithmeticException e) {
			System.out.println("our exception hendle...");
		}
		System.out.println("rest code will be run...");

	}
}