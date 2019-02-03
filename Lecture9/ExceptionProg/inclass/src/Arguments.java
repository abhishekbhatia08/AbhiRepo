class Arguments{
	
public static void main(String[] args) {
	try{
		int count =0,a,sum=0;

	for (int i=0;i<args.length ;i++ ) {

		a=Integer.parseInt(args[i]);
		count=count+1;
		sum+=a;
	}

	if(count<5)
	{
		throw new CheckArgumentsException("Arguments are less than 5");

	}
	else
	{
		System.out.println(sum);
	}


}
catch(Exception e)
{
	System.out.println(e);
}
finally
{
	System.out.println("always executed");
}
}
}
