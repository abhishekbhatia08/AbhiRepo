class ResizableCircle extends Circle1 implements Resizable
{
	ResizableCircle(double radius)
	{
		super(radius);
	}
	public void resize(int percent)
	{
		radius = (percent/100)*radius+radius;
		System.out.print(radius);
	}
}