package AddTheData;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

import UserPort.UserDetails;
import UserPort.UserInterface;

public class MakeDatabase {
	//private Object ;

	public void main() {

		FileOutputStream details;
		ObjectOutputStream details2;
		

		try {
			details = new FileOutputStream("C:\\Users\\manish\\Documents\\dataofmembers.txt");
			details2 = new ObjectOutputStream(details);
			Scanner scan = new Scanner(System.in);
			System.out.println("enter how many member data you want to fill in file");
			int a3 = scan.nextInt();
			System.out.println();
			Scanner scan1 = new Scanner(System.in);

			for (int i = 1; i <= a3; i++) {

				System.out.println("Enter your id ");
				String id = scan1.nextLine();

				System.out.println("Enter your name");
				String name = scan1.nextLine();

				System.out.println("Enter your sername");
				String sername = scan1.nextLine();

				String detils = id + name + sername;
				System.out.println("successfully fill your details in file....");
				details2.writeObject(detils);
				
				{
					  
				  }
				 
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  {
			Scanner scan2 = new Scanner(System.in);
			  System.out.println("Do you want to write a message ..");
			  System.out.println("press 'y' yess|  and 'n'for No ..  ");
			  String sc=scan2.next();
			  String cc="y";
			  if (sc.equals(cc)) {
				 UserInterface.main1(); 
			  }
			 else {
				System.out.println("");}
			
		}

	}
}
