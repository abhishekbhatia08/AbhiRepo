import java.util.*;
class HeartRateTest{

	 public static void main(String[] args)
  {
    
        Scanner input = new Scanner(System.in);
 
        

      HeartRate p1[]=new HeartRate[3];
        for(int i=0;i<3;i++)
        {
        	 System.out.println("Enter First Name: ");
        String firstName = input.nextLine();
        input.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Enter BirthDate: ");
         int day=input.nextInt();
         int month=input.nextInt();
         int year=input.nextInt();

        	p1[i]=new HeartRate(firstName, lastName,day,month,year);
        	System.out.printf("Name: "+ firstName +", " + lastName);
        System.out.printf("Age in years: \n", p1[i].getAge());
        System.out.println("Maximum Heartrate: "+ p1[i].MaximumHeartRate());
        p1[i].targetHeartRate();
        }
 
    }
}