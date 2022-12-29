package com.JavaException;

import java.util.Scanner;

public class Testcostom {
	public static void main(String[] args) {
		// int name=1;
		//final String name2="no";
		Scanner myObj = new Scanner(System.in);
		System.out.println("you have a account press '1'");
		System.out.println("you dont have any account press '2'");
		System.out.println("");
		int userName = myObj.nextInt();
		//System.out.println(userName.equals(name));//true
	     int no=userName;
		
		if(no!=1) {
			System.out.println("ELSE");
			selfmakeexception a = new selfmakeexception();
		try {
			a.your_details();
		} catch (Exception e) {
			System.out.println(e);
		}
			
		
		}
		else{
			System.out.println("hello");
			Inputuser sc = new Inputuser();
			sc.Inputuser();
		
			
			
		}
		
		
		
		

		

	}
}
