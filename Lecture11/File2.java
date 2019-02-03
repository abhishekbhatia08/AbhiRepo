import java.util.*;
import java.io.*;
class File2
{public static void main(String[] args) {
	try{
   File f =new File("data1.txt");
   FileWriter fout= new FileWriter(f);
   BufferedWriter bout=new BufferedWriter(fout);
	Scanner sc=new Scanner(System.in);
	boolean flag=true;
	bout.write(sc.nextLine());

	bout.close();

	FileReader fin= new FileReader(f);
   BufferedReader bin=new BufferedReader(fin);
   String s;
   
   while(((s=bin.readLine())!=null)&&flag)
   {
   System.out.println(s);
   String str[]=s.split[''];
   String search =sc.next();
   for (int i=0;i<str.length ;i++ ) {
   	
   
   	if (search.equals(str[i]) ){
   		System.out.println("Present");
   		flag=false;
   		
   	}
   }
   }

}
catch(Exception e)
{
	System.out.println(e);
}
}
}