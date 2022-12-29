package execep;

public class gshan {
	 void m1(int a) throws costom {
if (a>=6) {
	throw new costom("gshan dhyan de");
}		

	}
	 public static void main(String[] args) {
		gshan s=new gshan();
		try {
			s.m1(7);
		} catch (costom e) {
			System.out.println(e);
//			e.printStackTrace();
		}
	}

}
