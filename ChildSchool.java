package Loop;

import Loop.SimpleCal;
import java.util.Scanner;

public class ChildSchool {
	public static void main(String[] args) throws Exception {
		System.out.println("WEL-COME TO CHILD SCHOOL");
		Scanner scan = new Scanner(System.in);
		System.out.println("  START LEARNING");
		for (int i = 0; i <= 5; i++) {
			
			System.out.println("CHOOSE SUBJECT");
			System.out.println("1. MATH ,2. ENGLISH ");
			
			int sub = scan.nextInt();
			int sub1 = 1;
			if (sub == sub1) {

				int x = 0;
				for (int i1 = 1; i1 <= 10; i1++) {
					for (int j = 1; j <= 10; j++) {
						x++;
						System.out.print(x + "  ");
					}

					System.out.println();
				}
				System.out.println("......TABLE......");

				System.out.print("ENTER A TABLE NUMBER : ");

				int num = scan.nextInt();

				for (int i1 = 1; i1 <= 10; i1++) {
					{

						System.out.println(num + " * " + i1 + " = " + num * i1);
					}

				}
				System.out.println("All arithmetic opration");
				try {
					SimpleCal.main1();
				} catch (Exception e) {
					System.out.println("something went wrong");
					//e.printStackTrace();
				}
				System.out.println("  ");
			}

			else {
				System.out.println("PRESS BIG 'A' FOR BIG ALFABETS   ");
				System.out.println("PRESS 'a' FOR SMALL ALFABETS ");
				String a = scan.next();

				if (a.equals("A")) {
					int count = 0;
					for (char c = 'A'; c <= 'Z'; ++c) {
						System.out.print(c + " ");
						count++;

					}
					System.out.println("TOTAL ALFABETS" + count);
				} else {
					for (char c = 'a'; c <= 'z'; ++c) {
						System.out.print(c + " ");
					}

				}

			}
			// System.out.println("THANKS");}
		}
	}
}
