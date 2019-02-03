import java.util.*;

class Circle
{
	int radius;
	double findArea()
    {
      return radius*radius*3.14;
    }

    void displayArea()
    {
    	System.out.print("area =" +findArea());
    }
      void askvalue()
{
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the value of radius");
		radius = scan.nextInt();
}
}		
