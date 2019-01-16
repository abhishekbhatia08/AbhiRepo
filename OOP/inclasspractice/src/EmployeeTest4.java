import java.util.*;
public class EmployeeTest4
{
   public static void main(String[]args)
   {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of Employees:");
      int num=scan.nextInt();
      Employee4 Employee4[]=new Employee4[num];
      int i;
      for (i=0;i<num;i++)
      {
         Employee4[i] = new Employee4();
         System.out.println("Enter the name of Employee:");
         Employee4[i].name = scan.nextLine();
         if (i==0) scan.nextLine();
         System.out.println("Enter the Year of Joining:");
         Employee4[i].yearOfJoining = scan.nextInt();
         System.out.println("Enter the address of Employee:");
         scan.nextLine();
         Employee4[i].address = scan.nextLine();
      }
      System.out.println("Name\t\tYear\t\tAddress");
      for (i=0;i<num;i++)
      {
         Employee4[i].displayInfo();
      }
   }
}