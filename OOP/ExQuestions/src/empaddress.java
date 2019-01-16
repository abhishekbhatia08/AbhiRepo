class empaddress
{
 String firstName;
 String lastName;
 double monthlySalary;

address a;

 empaddress()
 {
 	firstName= "Kabir";
  lastName= "Singh";
  monthlySalary=15000;

  
 }

 empaddress(String f, String l, double s, String c,String b,double p)
 {
 	
 	this.firstName =f;

  this.lastName =l;
  
  this.monthlySalary=s;

  a=new address(c,b,p);
  
   
 }
     void info()
     {
     	System.out.println("firstName"+firstName+"lastName"+lastName);
     }



     

	public double getMonthlySalary()

	{
		if(this.monthlySalary>0){

			this.monthlySalary=monthlySalary;
           }
		else
      {
			System.out.println("no. is negative");
   	
   }

   

		return monthlySalary;

	}
  public void displayAddress()
   {
    System.out.println(a.firstline+""+a.secondline+""+a.pincode);
   }

}