package Loop;

import java.util.Scanner;

public class SimpleCal2 {
	public static void main(String[] args) {
		char oprator;
		double value1, value2, value3;
		for(int a=0;a<=1;) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value");
		value1 = scan.nextDouble();
		System.out.println("Enter opertor");
		oprator = scan.next().charAt(0);
		System.out.println("Enter second value");
		value2=scan.nextDouble();
		switch (oprator) {
		case '+': {
			System.out.println(value3=value1+value2);	
		}
		break;
		case '-':{
			
			System.out.println(value3=value1-value2);	
		}
		break;
		case'*':{
			System.out.println(value3=value1*value2);	
		}
		break;
		case'/':
		{
			System.out.println(value3=value1/value2);	
			
		}
		break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + oprator);
		}
		}

	}
}
