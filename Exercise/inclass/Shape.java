public abstract class Shape
 { protected  boolean filled;

 protected String color;
 abstract double getArea();
abstract double getPerimeter();
abstract  public String toString();
 public Shape()
 {
   color ="red";
   filled =true;
 }

 public Shape(String color,boolean filled)
 {
  this.color=color;
  this.filled=filled;
 }

 public String getcolor()
{
  return color;
}
 public void setcolor(String color)
{
  this.color=color;
}
public boolean isFilled()
{
  return filled;
}
public void setFilled(boolean filled)
{
  this.filled=filled;
}



}