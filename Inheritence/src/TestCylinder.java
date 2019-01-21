class TestCylinder
{
 public static void main(String[] args)
 {
 	Cylinder c1=new Cylinder();
    System.out.println(c1.getcolor());
    System.out.println(c1.getRadius());
    System.out.println(c1.getArea());
    System.out.println(c1.getVolume());


    Cylinder c2=new Cylinder(2,7,"black");
    System.out.println(c2.getcolor());
    System.out.println(c2.getRadius());
    System.out.println(c2.getArea());
    System.out.println(c2.getVolume());


  }
  
  }  