class GeometricTest
{
	public static void main(String[] args) 
		{
         ResizableCircle c=new ResizableCircle(10);
         System.out.println(c.getPerimeter());
         System.out.println(c.getArea());

         c.resize(10);
         System.out.println(c.getPerimeter());
         System.out.println(c.getArea());
   
   
		}
	
}