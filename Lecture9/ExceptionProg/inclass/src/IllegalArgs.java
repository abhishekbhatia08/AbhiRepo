import java.util.*;
class ExceptionHnadcling
{
	public static void main(String[] args) {
		if (tittle == null)
		{
			throw new IllegalArgumentException("");	 
		}
		System.out.prntln(tittle);
			
	}
}
class IlllegalArgs
{
	public static void main(String[] args) {
	int choice ;
	System.out.println("Ente choice b/w 1 to 5");
	choice=scan.nextInt();
    switch(choice)
    {
    	case 1: int a=10 , b=0;
    	try
    	int ans=a/b;
    	System.out.println("Result:"=ans);
    }
    catch(ArithmeticException e)
    {
    	System.out.println("Dont divide by 0");
    }
    break;
    case 2;
    try
    {
    	int a[]=new int [5];
    	a[11]=9;
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
    	System.out.println("e")
    }
    break;
    case 3;
    try
    {
    	int num=Integer.parseInt("xy");
    }
    catch(NumberFormatException e)
    {
    	System.out.println("e")
    }
    break;
    case 4;
    try
    {
    	int a[]=new int [5];
    	a[11]=9;
    }
    catch(NullPointerException e)
    {
    	System.out.println("e")
    }
    break;

    case 5;
    try
    {
    	String x=null;

     setTitle(x);
    }
    catch (IllegalArgumentException e)
    {
    	System.out.println("IllegalArgumentException..");
    }
    break;

	}
}
