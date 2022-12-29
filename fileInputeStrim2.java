package execep;              

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileInputeStrim2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("‪‪C:\\Users\\manish\\Documents\\manish.txt"));
			System.out.println("file open");
			int i;
			while ((i = fis.read()) != -1)
				
			System.out.println((char) i);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				fis.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			System.out.println("file close");
		}
	}

}
