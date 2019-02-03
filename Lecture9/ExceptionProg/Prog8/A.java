public class A
{
	public void g() throws Exception1{
	throw new Exception1("Hello");
}
	public void f() throws Exception2
	{
		try{
		g();
	}catch (Exception1 e1)
	{
		System.out.println(e1);
	}
	}


}