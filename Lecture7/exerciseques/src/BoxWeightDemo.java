import java.util.*;
class BoxWeightDemo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimensions of box - width, height, depth and weight");
		BoxWeight b = new BoxWeight();
		b.width = scan.nextFloat();
		b.height = scan.nextFloat();
		b.depth = scan.nextFloat();
		b.weight = scan.nextFloat();
		b.display();
	}
}