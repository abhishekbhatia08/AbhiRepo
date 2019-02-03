class Point
{
	private float x;
	private float y;

	Point()
	{
		this.x=0;
		this.y=0;
	}

	Point(float x,float y)
	{
		this.x=x;
		this.y=y;
	}

	void setvaluex(float x)
	{
		this.x=x;

	}

	void setvaluey(float y)
	{
		this.y=y;
		
	}

	float getvaluex()
	{
		return x;
	}
	float getvaluey()
	{
		return y;
	}

   float calculateDistance(Point p)
   {
      float dist= (float)Math.sqrt(Math.pow((getvaluex()-p.getvaluex()),2)+
      	Math.pow((getvaluey()-p.getvaluey()),2));
      	return dist;
   }

}