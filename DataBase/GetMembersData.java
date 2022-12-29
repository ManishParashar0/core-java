package DataBase;
import java.io.FileInputStream;
import java.io.SequenceInputStream;
import java.io.Serializable;


public class GetMembersData {
	public static void getdata() {
		FileInputStream data = null;
		FileInputStream data2 = null;

		try {
			data = new FileInputStream("C:\\Users\\manish\\Documents\\dataofmembers.txt");
			data2 = new FileInputStream("C:\\Users\\manish\\Documents\\userinput.txt");
			SequenceInputStream seq = new SequenceInputStream(data, data2);
			int i;
			while ((i = seq.read()) != -1) {
				System.out.print((char) i);
			}
			data.close();
			data2.close();
			System.out.println(data.available());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	
}
