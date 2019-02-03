class Circle 
 { private double radius = 1;

 private String color="red";
  Circle()
  {
  	radius = 1;
  	color = "red";
  }
Circle ( double radius)
{
	this.radius=radius;
    this.color="red";
}
Circle ( double radius,String color)
{
	this.radius=radius;
    this.color=color;
}

 double getRadius()
 {
 	return radius;
 }
 void setRadius()
 {
 	this.radius=radius;
 }
String getcolor()
{
	return color;
}
 void setcolor()
{
	this.color=color;
}
double getArea()
{
	return 3.14*radius*radius;
}
}

class Cylinder extends Circle
{
	private double height=1;

Cylinder()
{
	height=1;
}

Cylinder ( double radius)
{
	super(radius);
	this.height=1;
}

Cylinder (double radius,double height)
{
	super(radius);
    this.height=height;
}

Cylinder(double radius ,double height, String color)
{
	super(radius,color);
	this.height=height;
}
double getHeight()
{
	return height;

}
void setHeight(double height)
{
	this.height=height;
}

double getVolume()
{
	return getArea()*height;
}
}