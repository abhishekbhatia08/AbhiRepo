package com.ncu.main;
import  com.ncu.exceptions.*;
import  com.ncu.validators.*;
import  com.ncu.processors.*;
import java.util.Scanner;
class JSONConverter{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String c,csvfilename,jsonfilename;
		boolean b;
		NameValidator csvobject=new NameValidator();
		System.out.println(" Csv File");
		csvfilename =scan.nextLine();
		System.out.println("the entered path is"+csvfilename);
		b=csvobject.nameValidator(csvfilename,"csv");
		if(b==true)
			
			{
				System.out.println("csv file is ok");
				System.out.println("json file");
				jsonfilename=scan.nextLine();
				b=csvobject.nameValidator(jsonfilename,"json");
				if (b==true) {
					System.out.println("json file is ok");
					csvprocessor procesorobj=new csvprocessor();
					boolean b1=procesorobj.processorCsv(csvfilename,jsonfilename);
					if(b1==true)
					{
						System.out.println("converted");
					}
				}
			}
	}
	
}