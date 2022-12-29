package com.JavaException;

public class MultitryCatch {
	public static void main(String[] args) {
		System.out.println("start code ");
		try {
			try {
				int a = 10;
				int b = 0;
				int c = a / b;
				System.out.println(c);

			} catch (ArithmeticException e) {
				System.out.println("exception hendle");
				System.out.println(e);

			}
			try {
				int a[] = new int[6];
				System.out.println(a[7]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("exeption hendle");
				System.out.println(e);
			}

			try {
				String a = "code kro bhaii";
				int c = Integer.parseInt(a);
				System.out.println(c);

			} catch (NumberFormatException e) {
				System.out.println(e);
				System.out.println("exception hendle");
			}try {
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			

		} catch (Exception e) {
			System.out.println(e);
			System.out.println("complite");
		}
		System.out.println("end code run");
	}

}