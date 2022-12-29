package UserPort;

import java.util.Scanner;

import DataBase.GetMembersData;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UserInterface {
	 public static void main1() {

		Scanner scan = new Scanner(System.in);
        
		FileOutputStream user = null;
		try {
			user = new FileOutputStream("C:\\Users\\manish\\Documents\\userinput.txt");
			BufferedOutputStream user2 = new BufferedOutputStream(user);
			System.out.println("enter your discription");
			String a = scan.nextLine();
			byte[] b = a.getBytes(); 
			user.write(b);
			System.out.println("success....");
			/*
			 * System.out.println("if you want to read member data press 'y' else 'n'  ");
			 * String sc=scan.next(); String a1="y"; if(sc.equals(a1)) { GetMembersData
			 * obj=new GetMembersData(); obj.getdata(0);
			 * 
			 * }else { System.out.println("done"); }
			 */
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
