package Summery;
import java.util.Scanner;

import LoginPort.Login;
import UserPort.GetDetails;

public class Front {
	public static void main(String[] args) throws Exception {
		Scanner scan=new Scanner(System.in);
		System.out.println("   Wel-come to datastore Application   ");
		System.out.println("  1 .= Already have account  ");
		System.out.println("  2 .= Creat account");
		
		System.out.println("If you have a account press 'y' else 'n'to creat new account ");
		String sc=scan.next();
		String a="y";
		if (sc.equals(a)) {
			Login obj=new Login();
			obj.login1();
		}else {
				GetDetails obj1=new GetDetails();
				obj1.getdetails();
			}
			
		}
	}


