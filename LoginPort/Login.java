package LoginPort;

import java.util.Scanner;

import AddTheData.MakeDatabase;

// javax.print.DocFlavor.STRING;

import UserPort.UserDetails;
import UserPort.function;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Login {

	public void login1() throws Exception {
		Scanner scan = new Scanner(System.in);

		try {
			FileInputStream file = new FileInputStream("\\Users\\manish\\Documents\\data.txt");
			ObjectInputStream obj = new ObjectInputStream(file);
			Object object = obj.readObject();
			UserDetails e = (UserDetails) object;

			System.out.println("     WELCOME TO LOGING PAGE    ");
			System.out.println("ENTER ID ");
			int id = scan.nextInt();
			System.out.println("Enter your name");
			String name = scan.next();
			System.out.println("Enter your sername");
			String sername = scan.next();
			System.out.println("Enter your password ");
			String password = scan.next();

			System.out.println(e.id);
			if (id == e.id && password.equals(e.password)) {

				System.out.println("   YOU ARE SUCCESFULLY LOGING  ");

			}

			else {
				throw new Exception("SOME THING WENT WRONG");

			}
			/*
			 * MakeDatabase a = new MakeDatabase(); System.out.println("");
			 * System.out.println("           WELCOME TO DATASTORE          "); a.main();
			 */
			file.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			System.out.println("done");
		}
     function.function();
	}

}
