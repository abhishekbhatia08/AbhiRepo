import java.io.File;

public class FileD {
   
   public static void main(String[] args) {
      File f = null;
      String strs = "file.txt";
      try {
            // create new file
            f = new File(strs);
            String a = f.getAbsolutePath(); 
            boolean b= f.canRead();
            
            // prints absolute path and length
 	     System.out.print("\n"+a);
            System.out.print("\nLength =" +f.length());
            System.out.println(b);
            
         } catch (Exception e) {
         // if any I/O error occurs
         e.printStackTrace();
      }
   }
}