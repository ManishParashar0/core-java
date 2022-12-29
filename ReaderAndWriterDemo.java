package execep;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ReaderAndWriterDemo {
public static void main(String[] args) {
	FileReader fr=null;
	FileWriter fw=null;
	try {fr=new FileReader("‪C:\\Users\\manish\\Documents\\manish.txt");
		fw=new FileWriter("‪C:\\Users\\manish\\Documents\\maan.txt");
	int ch;
	while((ch=fr.read())!=-1) {
		fw.write(ch );
	}
	
	} catch (Exception e) {
		
	}
	
	
	
}
}
