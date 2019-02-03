import java.util.Scanner;

class Seven
{
   public static void main(String args[])
   {
   	  int i,num,occ=0,choice,count=0;
   	  int arr[] = new int[5];
   	  char b;
   	  Scanner scan = new Scanner(System.in);
   	  System.out.println("Enter any 5 value in the the array ");
   	  for(i=0;i<5;i++)
   	  {
   	  	 arr[i] = scan.nextInt();
   	  }
   	  int large=arr[0];
   	  int small=arr[0];
   	  int slarge=arr[0];
   	  int sum=0,asum=0;
   	  System.out.println("Enter Your choice");
   	  System.out.println("1.Elements in array");
   	  System.out.println("2.Sum ofthe elements of the array");
   	  System.out.println("3.Largest number in the array");
   	  System.out.println("4.Smallest number in the array");
   	  System.out.println("5.Second largest number in the array");
   	  System.out.println("6.Sum of alternative number of an array");
   	  System.out.println("7.Count of even number in an array");
   	  System.out.println("8.Occurrence of a given number in the array and its frequency");
      System.out.println("Enter your choice");
      choice = scan.nextInt();
    	for (i = 0; i < 5; i++)
       { 
             if (arr[i] > large) 
             { 
                slarge=large;
                large = arr[i];
             } 
             if (arr[i]<small)
             {
             	small = arr[i];
             }    
             sum = sum+arr[i];
             if(i%2!=0)
             {
                asum = asum+ arr[i];
             }
             if(arr[i]%2==0)
             {
             	count++;
             }    
       } 
       do
       {
       	   switch(choice)
         {
        	 case 1:
       	     for(i=0;i<5;i++)
        	 {
       	    	System.out.print(arr[i]);
        	 }
        	 break;
        	 case 2:
        	 System.out.print(sum);
        	 break;
        	 case 3:
        	 System.out.print(large);
        	 break;
        	 case 4:
        	 System.out.print(small);
        	 break;
        	 case 5:
        	 System.out.print(slarge);
        	 break;
        	 case 6:
        	 System.out.print(asum);
        	 break;
        	 case 7:
        	 System.out.print(count);
        	 break;
        	 case 8:
        	 System.out.println("Enter the number you want to serch for");
        	 num =scan.nextInt();
        	 for(i=0;i<5;i++)
        	 {
        	 	if(num==arr[i])
        	 	{
       	    		occ++;
        	 	}
        	 }
           	 System.out.println("Occurrence is "+occ);
             break;
        	 default:
        	 System.out.println("Enter valid option");
       	 }
        System.out.println("");
        System.out.println("Enter N to exit or press any key to continue");
			b=scan.next().charAt(0);
   	  }
				while(b!='N');   
    }
}