class Employee
{
 String firstName;
 String lastName;
 double monthlySalary;

 Employee()
 {
 	firstName= "ranbir";
  lastName= "kapoor";
  monthlySalary=1000;
 }

 Employee(String f, String l, double s)
 {
 	
 	this.firstName =f;

  this.lastName =l;
  
  this.monthlySalary=s;
  
   
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

}
