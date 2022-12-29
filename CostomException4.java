package com.JavaException;

import java.util.Scanner;

//import javax.print.DocFlavor.STRING;

public class CostomException4 extends RuntimeException {
	public CostomException4(String str) {
		super(str);
	}
}

class selfmakeexception extends Inputuser {

	public void your_details() throws CostomException4 {

		Scanner myObj = new Scanner(System.in); //
		System.out.println();
		System.out.println("ENTER YOUR NAME=");
		String userName = myObj.nextLine();
		System.out.println("ENTER YOUR SERNAME");
		String SERNAME = myObj.nextLine();
		System.out.println("ENTER MOBILE NUMBER");
		int number = myObj.nextInt();
		try {
			long Mobilenum = Long.valueOf(number);

			selfmakeexception a = new selfmakeexception();
			a.NextProcces(userName, SERNAME, Mobilenum);
		} catch (NumberFormatException e) {
			System.out.println(" Invalid enter valid mobile number");

		}
		System.out.println(userName);

	}

	void NextProcces(String name, String sarname, long number) throws CostomException4 { // if (this.userName) {}

		if ((name1 != name) && (sername1 != sarname) && (mobilenumber1 != number)) {
			System.out.println("invalid");
			System.out.println();
			System.out.println(" some thing wrong re-check your details");
			// throw new CostomException4("valid ");
			System.out.println();

			// your_details();
		} else {
			System.out.println("valid");
			System.out.println("its your enter details");
			System.out.println(".....................");
			System.out.println("your name=     " + name);
			System.out.println("your sername=  " + sarname);
			System.out.println("mobile number=  " + number);

		}

	}

	/*
	 * public static void main(String[] args) { try { your_details(); } catch
	 * (Exception e) { System.out.println(e); } }
	 */
}
