class EmployeeTest
{
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.info();
		e1.getMonthlySalary();

		 double yearlysalary=e1.getMonthlySalary()*12;
          System.out.println("Yearly Salary:"+yearlysalary);
         double salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));

		Employee e2= new Employee("aarushi","dua",10000);
	
	            e2.info();
				e2.getMonthlySalary();
				 yearlysalary=e2.getMonthlySalary()*12;
				System.out.println("Yearly Salary:"+yearlysalary);
				 salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));

		
	}
}
