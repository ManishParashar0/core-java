package Loop;

import java.io.*;
import java.util.Scanner;

public class My_short_cut {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Runtime runtime = Runtime.getRuntime();
		System.out.println("@ hii its boat reply version 2");
		System.out.println(
				" @Its program make for programer, who dont want to west our time for sweping application between at the time of code writing     ");
		System.out.println("@ This program give you some short cut tricks.     ");
		System.out.println("@press the related number summary will given bellow ");
		System.out.println("1 .shutdown");
		System.out.println("2 .notepad");
		System.out.println("3 .chrome");
		System.out.println("4 .visual code");
		while (true) {
			try {
				int input = scanner.nextInt();
				switch (input) {
				case 1: {
					System.out.println("Shutting down the PC after 5 seconds.");
					runtime.exec("shutdown -s -t 5");
				}
					break;
				case 2: {
					System.out.println("notepad open succesfully");
					runtime.exec("NOTEPAD.EXE");

				}
					break;
				case 3: {
					runtime.exec("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"");
				}
					break;
				case 4: {
					runtime.exec("\"C:\\Users\\manish\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe");

				}
					break;
				default:
					throw new IllegalArgumentException("your input note related to our program : " + input);
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
