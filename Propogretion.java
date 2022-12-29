package execep;

public class Propogretion {
	void m1() {
		System.out.println(10 / 0);
	}

	void m2() {
		m1();
	}

	void m3(int a, int b) {
		
			throw new ArithmeticException("opos something wrong");
		//System.out.println();
		}//m2();
	

	public static void main(String[] args) {
		Propogretion s = new Propogretion();
		s.m3(23,3);
	}
 
}
