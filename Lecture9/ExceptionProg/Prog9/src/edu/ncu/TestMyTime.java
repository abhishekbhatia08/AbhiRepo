import java.util.*;
class TestMyTime
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hour=sc.nextInt();
		int minute=sc.nextInt();
		int second=sc.nextInt();
		try{
			MyTime t=new MyTime(hour,minute,second);
			MyTime t1 = t.previousHour();
			System.out.println(t1.toString());
			MyTime t2 = t.previousMinute();
			System.out.println(t2.toString());
			MyTime t3= t.previousSecond();
			System.out.println(t3.toString());

		
		}
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}
}