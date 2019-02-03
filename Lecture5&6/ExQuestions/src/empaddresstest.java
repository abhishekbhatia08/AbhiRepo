class empaddresstest
{
	public static void main(String[] args) {
		empaddress e1 = new empaddress();
		e1.info();
		e1.getMonthlySalary();


		 double yearlysalary=e1.getMonthlySalary()*12;
          System.out.println("Yearly Salary:"+yearlysalary);
         double salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));

		empaddress e2= new empaddress("Abhishek","Bhatia",10000,"237 ","Rohini",110085);
	
	            e2.info();
				e2.getMonthlySalary();
				e2.displayAddress();
				 yearlysalary=e2.getMonthlySalary()*12;
				System.out.println("Yearly Salary:"+yearlysalary);
				 salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));




		
	}
}