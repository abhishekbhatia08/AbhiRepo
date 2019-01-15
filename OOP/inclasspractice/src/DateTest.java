class Date
{ 
	

	int month;
	int day;
	int year;

	void displayDate()
	{
      System.out.println(day+"/"+month+"/"+year);
	}
     Date()
     {
     	month=1;
     	day=1;
     	year=2000;
     }
     Date(int d,int m,int y)
     {
     	this.day=d;
     	this.month=m;
     	this.year=y;
     }

}

public class DateTest
{
	public static void main(String[] args) {
	

		Date d= new Date();
		d.displayDate();

		Date d2= new Date(9,12,2000);
		d2.displayDate();

		
	}
	
}