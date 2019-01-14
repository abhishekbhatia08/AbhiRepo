import java.util.*;
class Month 
{
	public static void main(String args[])//main program to show the name of month as per user's choice 
{ 	 
	Scanner in=new Scanner(System.in);
	char a;
	do {
	System.out.println("Please enter any number between 1 to 12");
	int number=in.nextInt();
	switch(number) {
		case(1):
			System.out.println("Name of the month is January");
			break;
		case(2):
			System.out.println("Name of the month is February");
			break;
		case(3):
			System.out.println("Name of the month is March");
			break;
		case(4):
			System.out.println("Name of the month is April");
			break;
		case(5):
			System.out.println("Name of the month is May");
			break;
		case(6):
			System.out.println("Name of the month is June");
			break;
		case(7):
			System.out.println("Name of the month is July");
			break;
		case(8):
			System.out.println("Name of the month is August");
			break;
		case(9):
			System.out.println("Name of the month is September");
			break;
		case(10):
			System.out.println("Name of the month is October");
			break;
		case(11):
			System.out.println("Name of the month is November");
			break;
		case(12):
			System.out.println("Name of the month is December");
			break;
		default:
			System.out.println("Invalid number is chosen");
		}
		System.out.println("press Q to exit the program");
		a=in.next().charAt(0);
	}	while (a!='Q');
	}
	}