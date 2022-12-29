package execep;
  
import java.io.*;  
public class BufferedOutputStreamExample{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="manish parashar";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  