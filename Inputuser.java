package com.JavaException;
import java.util.Scanner;
public class Inputuser {
	 String name1 ;
	 String sername1;
	 long mobilenumber1;

	
   void Inputuser() {
	  
	Scanner myObj = new Scanner(System.in); //
		System.out.println();
		System.out.println("ENTER  NAME");
		String userName = myObj.nextLine();
		this.name1 = userName ;
		System.out.println("ENTER YOUR SERNAME");
		String SERNAME = myObj.nextLine();
		this.sername1=SERNAME;
		System.out.println("ENTER MOBILE NUMBER");
		int number = myObj.nextInt();
		
		try {
			long Mobilenum = Long.valueOf(number);
			this.mobilenumber1=Mobilenum;
			//this.mobilenumber1 = this.mobilenum;
		} 
		catch (NumberFormatException e) {
			System.out.println(" Invalid enter valid mobile number");
			
		}
	//	this.mobilenumber1 = mobilenumber1;
		//selfmakeexception a = new selfmakeexception();
		//a.your_details();
	

}
}
