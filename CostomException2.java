package com.JavaException;

public class CostomException2 extends Exception {
	public CostomException2 (String str) {
	super(str);	
	}
	
}class CostomException3{
	static int a=23;

	public static void m1(int number) throws CostomException2 {
		if (number == a) {
			throw new CostomException2("yes valid");
		} else {
			System.out.println("its invalid");
		}

	}
	public static void main(String[] args) {
		try {m1(23);}
		catch (CostomException2  e) {
			System.out.println(e);
		}
	}

}
