package execep;

public class popogretion {
	void m1() {
		System.out.println(12 / 0);
	}

	void m2() {
		m3();
	}

	void m3() {
		m1();
	
	}
	public static void main(String[] args) {
		popogretion as = new popogretion();
		
		try {
			
			as.m3();
		} catch (Exception e) {
			System.out.println(e);// TODO: handle exception
		}
		System.out.println("hello");
	}
}
