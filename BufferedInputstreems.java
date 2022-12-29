package execep;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class BufferedInputstreems{
public static void main(String[] args) {
	FileInputStream str=null;
	
	try {
	str=new FileInputStream("D:\\testout.txt");
	BufferedInputStream buff=new BufferedInputStream(str);
	int a;
	while((a=buff.read())!=-1) {
		System.out.print((char)a);
		buff.close();
		str.close();
		
	}
	} catch (Exception e) {
		// TODO: handle exception
	}
}	

}
