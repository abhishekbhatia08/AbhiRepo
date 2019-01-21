class Distance
{
	private float feet;
	private float inches;

	Distance()
	{
		feet=0;
		inches=0;
	}

	Distance(float f,float i)
	{
		this.feet=f;
		this.inches=i;
	}

	void setvaluef(float x)
	{
		this.feet=x;

	}


	void setvaluei(float y)
	{
		this.inches=y;
		
	}

	void  setvaluef(int x)
	{
		this.feet=x;
	}

	float getvaluef()
	{
		return feet;
	}
	float getvaluei()
	{
		return inches;
	}
	
	
	public void showDistance()
	{
		System.out.println("Feet: "+ feet + "\tInches: "+ inches);
	}
	
	public void addDistance(Distance D1, Distance D2)
	{
		inches=D1.inches+D2.inches;
		feet=D1.feet+D2.feet+(inches/12);
		inches=inches%12;
	}
}