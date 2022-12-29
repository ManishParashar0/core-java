package Loop;
import java.util.*;

public class Binarry {
	public static void main(String []arg) {
		int a[]=new int[100000];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int b=sc.nextInt();
		int c;
		for(c=0;b>0;c++)
		{
			a[c]=b%2;
			b=b/2;
		}
		for(c=c-1;c>=0;c--)
		{
			System.out.print(a[c]);
		}
	}
}
