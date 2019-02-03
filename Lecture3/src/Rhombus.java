 import java.util.*;
class Rhombus 
{
	public static void main(String args[]) 
	{// main method to print desired rhombus
		Scanner a=new Scanner(System.in);
		int rows;
		int i;
		int j;
		int count=1;
		int count2=1;
		int k;
		char b;
		char alphabet='A';
		do
		{
			System.out.println("Enter the number of rows");
			rows=a.nextInt();
			for(i=0;i<rows*2;i++)
			{
				for(j=rows-count2;j>0;j--)
					{
						System.out.print(" ");
					}
					if(i<rows)
						count2++;
					else
						count2--;
					for(k=0;k<count;k++)
					{
						System.out.print(alphabet);
						if(k<count/2)
							alphabet++;
						else
							alphabet--;
					}
					if(i<rows)
						count=count+2;
					else
						count=count-2;
					alphabet='A';
					System.out.println();
			}
			System.out.println("Press N to exit and any other key to continue");
			b=a.next().charAt(0);
		} while(b!='N');
			}
			}	