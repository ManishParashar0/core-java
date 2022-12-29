package UserPort;

import java.util.Scanner;

import AddTheData.MakeDatabase;
import DataBase.GetMembersData;

public class function {
	public static void function() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Edit and Creat Members Database (press 'y' )");
		System.out.println("view Members Data (press 'n' )");
		String sc1 = scan.next();
		String dc = "y";
		String tc = "n";
		if (sc1.equals(dc)) {
			MakeDatabase a = new MakeDatabase();
			System.out.println("");
			System.out.println("           WELCOME TO DATASTORE          ");
			System.out.println("");
			a.main();
		}
		
		
		if (sc1.equals(tc)) {
			System.out.println("if you want to read member data press 'y' else 'n'  ");
			String sc = scan.next();
			String a1 = "y";
			if (sc.equals(a1)) {
				GetMembersData obj = new GetMembersData();
				obj.getdata();

			}
		} else {
			System.out.println("");
		}
	}

}
