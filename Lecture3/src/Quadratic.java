import java.util.*;

class Quadratic
{
	public static void main(String[] args) 
{ 
        Scanner input = new Scanner(System.in);
        System.out.print("input a =");
        double a = input.nextDouble();
        System.out.print("input b =");
        double b = input.nextDouble();
        System.out.print("input c =");
        double c = input.nextDouble();

        double result=b*b -4*a*c;

        if (result>0.0)
        	{
        		double r1 = (-b + Math.pow(result,0.5)) / (2.0*a);
        		double r2 = (-b - Math.pow(result,0.5)) / (2.0*a);
        		System.out.println("The roots are" +r1+ "and" +r2);
        	 }  
        	 else if (result ==0.0)
        	 {
        	 	double r3 = -b/(2*a);
        	 }
        	 else
        	 {
        	 	System.out.println("this eq. has no real root");
        	 }
 }       	 	
}