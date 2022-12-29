package execep;
import java.io.SequenceInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class SeqanceOfoutputstreem {

	public static void main(String[] args) throws IOException {
		
			FileInputStream man=new FileInputStream("D:\\testout.txt");
			FileInputStream nam=new FileInputStream("C:\\\\Users\\\\manish\\\\Documents\\\\umar.txt");
			SequenceInputStream seq=new SequenceInputStream(man, nam);
			int a;
			
				while((a=seq.read())!=-1  ) {
					System.out.print((char)a);
					System.out.println();
					
				}
				man.close();
				nam.close();
						
	
	}}