import java.util.*;
public class DistanceTest
{
	public static void main(String[] args) {

		float x1,x2,y1,y2;

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter feet1: ");
		x1=sc.nextInt();
		System.out.print("Enter inches1: ");
		y1=sc.nextInt();
		

			Distance D1=new Distance(x1,y1);

		

			
			//read first distance
			System.out.println("Enter first distance: ");
			D1.showDistance();

			System.out.print("Enter feet2: ");
		x2=sc.nextInt();
		System.out.print("Enter inches2: ");
		y2=sc.nextInt();


			Distance D2=new Distance(x2,y2);
			
			//read second distance
			System.out.println("Enter second distance: ");
			D2.showDistance();


			
			Distance D3=new Distance();
			//add distances
			D3.addDistance(D1,D2);
			//print distance
			System.out.println("Total distance is:" );
			D3.showDistance();
		
	}
}