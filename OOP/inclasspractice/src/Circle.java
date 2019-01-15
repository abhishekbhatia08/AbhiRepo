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
}