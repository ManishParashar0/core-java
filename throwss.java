package execep;

public class throwss {
 void m1(int a, int b) {
	if (a!=b) {
		throw new ArithmeticException("ops hgsomething wrong");
		
	}else {
		System.out.println("write");
		
	}
	 
}
 public static void main(String[] args) {
	throwss a=new throwss();
	try {
		a.m1(1,0);
	} catch (Exception e) {
		// TODO: handle exceptionsyso
		System.out.println(e);
		
	}

	System.out.println("hello");
}
}
