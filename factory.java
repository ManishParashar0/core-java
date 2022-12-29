package Loop;
class factory1{
	int c=123;
	int b=123;
	
}
 class factory extends factory1{
	String a="12";
	
@Override
	public String toString() {
		return a;
	}
factory m1() {
	// TODO Auto-generated method stub
return new factory();
}
public static void main(String[] args) {
	factory a = new factory();
	System.out.println(a.m1());
}
}
