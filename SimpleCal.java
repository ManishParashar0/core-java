package Loop;

import java.util.Scanner;

public class SimpleCal {
	static void main1() throws Exception {
		Scanner scan = new Scanner(System.in);
		try {
			double value1, value2, value3;
			char opretor;
			
			System.out.println("Enter your value");
			value1 = scan.nextDouble();
			System.out.println("Enter second value");
			value2 = scan.nextDouble();
			System.out.println("Enter your operation");
			opretor = scan.next().charAt(0);
			scan.close();
			switch (opretor) {
			case '*': {

				value3 = value1 * value2;
				System.out.println(value3);
				
			}
			break;
			case '/': {
				value3 = value1 / value2;
				System.out.println(value3);
			}
			case '-': {
				value3 = value1 - value2;
				System.out.println(value3);
			}
			case '+': {
				value3 = value1 + value2;
				System.out.println(value3);
			}
			break;
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + opretor);
			}
			
		} catch (Exception e) {
			System.out.println("dont press space and enter");
			
		}
		System.out.println("ENTER KEY FOR EXIT");
		String a=scan.next();
		
	}
	
	

}
