package Loop;

import java.util.ArrayList;
import java.util.Scanner;

public class AutoReply {
	void testing() {
		Scanner scan = new Scanner(System.in);
		System.out.println("            Welcome    ");
		System.out.println("Hii its  Smart Reply....");
		int i = 0;
		while (i < 1) {
			String hii = scan.nextLine();

			String message;
			message = hii;

			switch (message) {
			case "hii": {
				System.out.println("How can i help you..");
				System.out.println("this is summary to related to over servise...");
				System.out.println("Talk to Over expert...");
				System.out.println("Hospitals..");
				System.out.println("medicine...");
				break;
			}
			case "hello": {
				System.out.println("How can i help you..");
				System.out.println("This is summary related to our services...");
				System.out.println("Talk to our expert...");
				System.out.println("Hospitals...");
				System.out.println("Medicine...");

				break;

			}

			case "hospitals": {
				ArrayList<String> list = new ArrayList<>();
				list.add("...THE CITY HOSPITALS ...");
				list.add("ADDRESS =  SAKINAKA WEST MUMBAI ");
				list.add("CONTECT = 09090909099");
				for (int i1 = 0; i1 <= list.size() - 1; i1++) {
					System.out.println(list.get(i1));
				}
				break;
			}
			case "medicine": {
				System.out.println("kilndy tell me whats happan ?");
				System.out.println("(seasonal illness,fever,headache,body pain)");
				//int i1 = 0;

				while (true) {
					String answer = scan.nextLine();
					String a = "hospitals";

					if (answer.equals(a)) {
						testingHospital(a);
						break;
					}

					switch (answer) {
					case "seasonal illness": {
						System.out.println("kindly visit over hospitals and nearest medical");
					}
						break;
					case "fever": {
						System.out.println("if you have high fever ,Recomended suppliments are");
						System.out.println("1. paracitamall " + "2. dollo500" + "3. Vics500");
						System.out.println("kindly visit our hospital");
					}
						break;
					case "headeche": {
						System.out.println("1. Saridon Advance ");
					}
						break;

					case "body pain": {
						System.out.println("Allopathic flutivate cream , pacimol active tablets");
					}
						break;

					default: {

						throw new IllegalArgumentException(" speeling mistake in... " + answer);
					}

					}
				}
			}
				break;
			default:
				throw new IllegalArgumentException("i cant reach ............... " + message);
			}
		}

	}

	static void testingHospital(String name) {

		Scanner scan = new Scanner(System.in);

		int i = 0;
		while (i < 1) {
			String hii = scan.nextLine();

			String message;
			message = hii;

			switch (message) {
			case "hii": {
				System.out.println("How can i help you..");
				System.out.println("this is summary to related to over servise...");
				System.out.println("Talk to Over expert...");
				System.out.println("Hospitals..");
				System.out.println("medicine...");
				break;
			}
			case "hello": {
				System.out.println("How can i help you..");
				System.out.println("this is summary to related to over servise...");
				System.out.println("Talk to Over expert...");
				System.out.println("Hospitals...");
				System.out.println("medicine...");

				break;

			}

			case "hospitals": {
				ArrayList<String> list = new ArrayList<>();
				list.add("...THE CITY HOSPITALS ...");
				list.add("ADDRESS =  SAKINAKA WEST MUMBAI ");
				list.add("CONTECT = 09090909099");
				for (int i1 = 0; i1 <= list.size() - 1; i1++) {
					System.out.println(list.get(i1));
				}
				break;
			}
			case "medicine": {
				System.out.println("kilndy tell me whats happan ?");
				System.out.println("(seasonal illness,fever,headache,body pain)");
				int i1 = 0;

				while (i1 < 1) {
					String answer = scan.nextLine();
					String a = "hospitals";

					if (answer.equals(a))

						break;

					switch (answer) {
					case "seasonal illness": {
						System.out.println("kindly visit over hospitals and nearest medical");
					}
						break;
					case "fever": {
						System.out.println("if you face high fever , this is recomended suppliments");
						System.out.println("1. paracitamall " + "2. dollo500" + "3.vics500");
						System.out.println("kindly visit over hospitals");
					}
						break;
					case "headeche": {
						System.out.println("1. saridon advance ");
					}
						break;

					case "body pain": {
						System.out.println("Allopathic flutivate cream , pacimol active tablets");
					}
						break;

					default: {

						throw new IllegalArgumentException(" speeling mistake in... " + answer);
					}

					}
				}
			}
				break;
			default:
				throw new IllegalArgumentException("i cant reach ............... " + message);
			}
		}

	}

	public static void main(String[] args) {
		AutoReply s1 = new AutoReply();
		s1.testing();
	}
}
/*
 * public static void main(String[] args) { Scanner scan = new
 * Scanner(System.in); System.out.println("            Welcome    ");
 * System.out.println("Hii its  Smart Reply...."); int i = 0; while (i < 1) {
 * String hii = scan.nextLine();
 * 
 * String message; message = hii;
 * 
 * switch (message) { case "hii": { System.out.println("How can i help you..");
 * System.out.println("this is summary to related to over servise...");
 * System.out.println("Talk to Over expert...");
 * System.out.println("Hospitals.."); System.out.println("medicine..."); break;
 * } case "hello": { System.out.println("How can i help you..");
 * System.out.println("this is summary to related to over servise...");
 * System.out.println("Talk to Over expert...");
 * System.out.println("Hospitals..."); System.out.println("medicine...");
 * 
 * break;
 * 
 * }
 * 
 * case "hospitals": { ArrayList<String> list = new ArrayList<>();
 * list.add("...THE CITY HOSPITALS ...");
 * list.add("ADDRESS =  SAKINAKA WEST MUMBAI ");
 * list.add("CONTECT = 09090909099"); for (int i1 = 0; i1 <= list.size() - 1;
 * i1++) { System.out.println(list.get(i1)); } break; } case "medicine": {
 * System.out.println("kilndy tell me whats happan ?");
 * System.out.println("(seasonal illness,fever,headache,body pain)"); int i1 =
 * 0;
 * 
 * while (i1 < 1) { String answer = scan.nextLine(); String a = "hospitals";
 * 
 * if (answer.equals(a))
 * 
 * break;
 * 
 * switch (answer) { case "seasonal illness": {
 * System.out.println("kindly visit over hospitals and nearest medical"); }
 * break; case "fever": {
 * System.out.println("if you face high fever , this is recomended suppliments"
 * ); System.out.println("1. paracitamall " + "2. dollo500" + "3.vics500");
 * System.out.println("kindly visit over hospitals"); } break; case "headeche":
 * { System.out.println("1. saridon advance "); } break;
 * 
 * case "body pain": {
 * System.out.println("Allopathic flutivate cream , pacimol active tablets"); }
 * break;
 * 
 * default: {
 * 
 * throw new IllegalArgumentException(" speeling mistake in... " + answer); }
 * 
 * } } } break; default: throw new
 * IllegalArgumentException("i cant reach ............... " + message); } }
 */
