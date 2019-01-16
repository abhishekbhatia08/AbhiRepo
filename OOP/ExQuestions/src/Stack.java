import java.util.*;
public class Stack
{
	Scanner scan= new Scanner(System.in);
	int arr[]= new int[10];
	int i=0;
	int index=0;
	void push()
	{
		for (i=0; i<arr.length; i++)
		{
			arr[i] = scan.nextInt();
		}
	}
	void pop()
	{
		index=arr.length;
		index=i-1;
		for(i=0;i<index;i++)
		{
			System.out.println(arr[i]);
		}
	}
	void isEmpty()
	{
		for(i=arr.length-1;i>0;i--)
		{
			if(i==0)
			{
				System.out.println("Stack is Empty");
			}
		}
	}
	void isFull()
	
		{
			if(i==arr.length)
			{
				System.out.println("Stack is full");
			}
		}

	
	void spaceLeft()
	
	
		{
			if(index>=0&index<9)
			{
				System.out.println("Space left in Stack");
			}
		}
	
}