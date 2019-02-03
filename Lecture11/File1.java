import java.util.*;
import java.io.*;
class File1
{public static void main(String[] args) {
     try{
   File f =new File("data.txt");
   FileWriter fout= new FileWriter(f);
   BufferedWriter bout=new BufferedWriter(fout);
     Scanner sc=new Scanner(System.in);
     boolean flag=true;

while(flag)
{
     System.out.println("enter 5 no.");

     bout.write(Integer.toString(sc.nextInt()));
     bout.write(' ');

     System.out.println("enter name");
     bout.write(sc.next());

     bout.write(' ');

     System.out.println("enter cgpa");
     bout.write(Float.toString(sc.nextFloat()));
     bout.write(' ');

     System.out.println("enter grade");
     bout.write(sc.next().charAt(0));
     bout.newLine();
     System.out.println("do u want to continue");
     char c= sc.next().charAt(0);
     if(c=='n'||c=='N')
     {
          flag=false;
     }
     
     }
     bout.close();

     FileReader fin= new FileReader(f);
   BufferedReader bin=new BufferedReader(fin);
   String s;
   while((s=bin.readLine())!=null)
   {
     String [] str=s.split(" ");
     System.out.println((str[0])+" "+(str[1])+" "+(str[2])+" "+(str[3]));
   }

}
     catch(Exception e)
     {
          System.out.println(e);
     }

}
}