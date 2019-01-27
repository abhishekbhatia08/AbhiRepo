class Shape
 { private boolean filled = true;

 private String color="red";
 Shape()
 {
   color ="red";
   filled =true;
 }
 String getcolor()
{
	return color;
}
 void setcolor()
{
	this.color=color;
}
boolean isFilled()
{
	return filled;
}
void setFilled()
{
	this.filled=filled;
}



 class Circle extends Shape
 { private double radius = 1;

 
  Circle()
  {
  	radius = 1;
  	
  }
Circle ( double radius)
{
	this.radius=radius;
    
}

Circle ( double radius, String color , boolean filled)
{
	this.radius=radius;
	this.color=color;
	this.filled=filled;
}
    
 double getRadius()
 {
 	return radius;
 }
 void setRadius()
 {
 	this.radius=radius;
 }

double getArea()
{
	return 3.14*radius*radius;
}
double getPerimeter()
{
	return 2*3.14*radius;
}
}



class Rectangle extends Shape
 { private double width = 1;
 	private double length = 1;

 
  Rectangle()
  {
  	width = 1;
  	length = 1;	
  }
Rectangle ( double width, double length)
{
	this.width=width;
    this.length=length;
}

Rectangle ( double width, double length , String color , boolean filled)
{
	this.width=width;
    this.length=length;
    this.color=color;
    this.filled=filled;
}
    
 double getWidth()
 {
 	return width;
 }
 void setWidth()
 {
 	this.width=width;
 }
 double getLength()
 {
 	return length;
 }
 void setLength()
 {
 	this.length=length;
 }

double getArea()
{
	return width*length;
}
double getPerimeter()
{
	return 2*(width+length);
}
}

class Square extends Rectangle
 { private double side = 1;


Square()
  {
  	side=1;
  }
Square ( double side)
{
	this.side=side;
}
Square ( double side , String color , boolean filled)
{
	this.side=side;
}

double getSide()
 {
 	return Side;
 }
 void setSide()
 {
 	this.Side=Side;
 }

 void setLength()
 {
 	this.width=width;
 }

void setWidth()
 {
 	this.width=width;
 }
double getArea()
{
	return side*side;
}
double getPerimeter()
{
	return 4*side;
}
}

