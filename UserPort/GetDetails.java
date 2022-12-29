package UserPort;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import UserPort.UserDetails;

public class GetDetails {

	public void getdetails() {
		FileOutputStream details;
		ObjectOutputStream details2;
		Scanner scan = new Scanner(System.in);
		try {
			details = new FileOutputStream("C:\\Users\\manish\\Documents\\data.txt");
			details2 = new ObjectOutputStream(details);
			System.out.println("Enter your id ");
			int id = scan.nextInt();
			System.out.println("Enter your name");
			String name = scan.next();
			System.out.println("Enter your sername");
			String sername = scan.next();
			System.out.println("Enter your password ");
			String password = scan.next();
			UserDetails log = new UserDetails(id, name, sername, password);
			details2.writeObject(log);
			System.out.println("successfully fill your details in file....");
			System.out.println("  ");
			details.close();
			//function fuc=new function();
	      	

		}
		
		catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}function.function();
	}
}
