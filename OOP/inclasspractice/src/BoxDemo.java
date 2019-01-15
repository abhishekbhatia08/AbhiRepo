class BoxDemo
{
	public static void main(String[] args)
	{
		Box b=new Box();
		b.setDim(2,3,4);
		double vol = b.volume();
		System.out.print(vol);

		Box b1=new Box();
		double vol1 = b1.volume();
		System.out.print(vol1);

		Box b2=new Box(2,4,7);
		double vol2 = b2.volume();
		System.out.print(vol2);

		Box b3=new Box(3,6);
		double vol3 = b3.volume();
		System.out.print(vol3);
	}
}