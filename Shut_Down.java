package Loop;
import java.io.*;

public class Shut_Down
{
   public static void main(String[] args) throws IOException
   {
      Runtime runtime = Runtime.getRuntime();
      System.out.println("Shutting down the PC after 5 seconds.");
//         runtime.exec("shutdown -s -t 5");
	 //System.out.println(runtime.availableProcessors());
     // System.out.println(runtime.freeMemory());
    // System.out.println( runtime.version());
      try {
     runtime.exec("NOTEPAD.EXE");
    	 //  runtime.exec("\"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe\"");
    	  
      }
      catch (Exception e) {
		// TODO: handle exception
	
      System.out.println(e);
      }
   }
}