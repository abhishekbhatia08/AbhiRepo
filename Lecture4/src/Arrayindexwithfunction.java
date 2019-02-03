import java.util.*;
 public class Arrayindexwithfunction
 {
 	int selement;
 	int counter=0;
 	Scanner scan=new Scanner(System.in);
 	int element[]=new int[10];
 	int flag =-1;

 	void enterelement()
 	{
 		System.out.println("enter 10 elements in array");
		for(counter=0; counter<10;counter++)
		{
			element[counter]=scan.nextInt();
		} 
 	 
    }
  void displayelement()
  {
  	System.out.println("the following elements were entered in array");
		for(counter=0; counter<10;counter++)
		{
			System.out.println(element[counter]);

		} 	
  }
  void checkelment(int aa)

  {
for(counter= 0; counter<10;counter ++)
{if(element[counter]==selement)
	{flag=1;
	break;
}
else
{
	flag = -1;
}

}
if(flag == 1)
{
	System.out.println("elements"+element[counter]+"found at position"+(counter +1));
}
else
{
	System.out.println("elements not found" +flag);
}
  }
 public static void main(String[] args) 
 {
 
	int selement;
   Arrayindexwithfunction  aiwf= new Arrayindexwithfunction();
   aiwf.enterelement();

   System.out.print("enter the element you want to find");
   Scanner scan= new Scanner(System.in);
   selement=scan.nextInt() ;

   aiwf.displayelement();
   aiwf.checkelment(selement);

}
}


