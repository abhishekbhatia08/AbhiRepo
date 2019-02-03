class Test{
	public static void main(String[] args) {
		try{
			Circle c = null;
		System.out.println(c.getPerimeter());
		System.out.println(c.getArea());
		}
		catch(NullPointerException e){
			System.out.println(" NullPointerException..");
		}
		System.out.println("Program Executed");
	}
}