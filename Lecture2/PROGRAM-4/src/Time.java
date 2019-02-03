class Time
{
	public static void main(String args[])
	{
		int a=60;
		double n;
		System.out.println("Given time in years= ");
		n=(1.903*a)/1000000;
		System.out.println(n);
		System.out.println("Given time in months= ");
		n=2.283*a/100000;
		System.out.println(n);
		System.out.println("Given time in days= ");
		n=a*0.000694;
		System.out.println(n);
	}
}