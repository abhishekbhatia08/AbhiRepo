import java.util.*;
class DMMAS
{
	public static void main(String args[])//main method to take two numbers and display the various output
	{
		Scanner a=new Scanner(System.in);
		int number1;
		int number2;
		System.out.println("Please enter the first number");
		number1=a.nextInt();
		System.out.println("Please enter the second number");
		number2=a.nextInt();
		//different data types are taken to get precise answers 
		int addition=number1 + number2;
		int subtraction=number1-number2;
		double division=number1 / number2;
		long multiplication=number1*number2;
		int modulus=number1%number2;
		System.out.println("Addition of two numbers= "+ addition);
		System.out.println("Multiplication of two numbers= "+multiplication );
		System.out.println("Subtraction of two numbers= "+ subtraction);
		System.out.println("Divison of two numbers= " + division);
		System.out.println("Modulus of two numbers= " + modulus);
	}
} 