import java.io.*;
import java.util.*;
class FileReader {
   public static void main(String[] args) {
      File f = null;
      try {
            f = new File("file.txt");
            FileReader fin = new FileReader(f);
            BufferedReader bin= new BufferedReader(fin);
                String sr;

             System.out.print("\nthe contents of the file are");
       while((sr=bin.readLine())!=null){
               System.out.println(sr);
        }
            
}         
    catch (Exception e) {
         // if any I/O error occur
                  e.printStackTrace();
      }    } }