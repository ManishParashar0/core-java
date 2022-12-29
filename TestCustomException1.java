package execep;

class Shamim extends Exception {
	public Shamim(String str) {

		super(str);
	}
}

public class TestCustomException1 {

	
	static void validate(int age) throws Shamim  {
		if (age < 18) {

			throw new Shamim("manish");
		} else {
			System.out.println("welcome to vote");
		}
	}
	public static void main(String args[]) {
		try {
			validate(1);
		} catch (Shamim e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}

		System.out.println("rest of the code...");
	}
}