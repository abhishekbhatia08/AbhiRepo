import java.util.*;

class Pointtest
{
	public static void main(String[] args) {
		
	
  Scanner s =new Scanner(System.in);
	float x1;
	float x2;
	float y1;
	float y2;

	float dist;
	float distance;

	Point p1 =new Point();
	Point p2=new Point();

	System.out.println("enter x1");

	x1=s.nextFloat();

	System.out.println("enter x2");
	x2=s.nextFloat();

	System.out.println("enter y1");
	y1=s.nextFloat();

	System.out.println("enter y2");
	y2=s.nextFloat();

	p1.setvalue(x1);
	p1.setvalue(y1);


	p2.setvalue(x2);
	p2.setvalue(y2);

	dist=p1.calculateDistance(p2);
	System.out.println(dist);


Point a1=new Point(x1,y1);
	Point a2=new Point(x2,y2);
	distance=a1.calculateDistance(a2);
System.out.println(distance);

}
}