class Square extends Rectangle
 {


Square()
  {
  	super();
  }
Square ( double side)
{
	super(side,side);
}
Square ( double side , String color , boolean filled)
{
	super(side,side,color,filled);

}

double getSide()
 {
 	return getWidth();
 }
 void setSide(double side)
 {
 	this.setWidth()=side;
 }

 

String toString()
{
  return("area"+getSide()*getSide()+"perimeter"+4*getSide());
}
}