class Project
{
String name;
String startDate;
String endDate;
String role;
String [] responsibilities;
Project()
{
	name="";
	startDate=" ";
	endDate="";
	role="";
	responsibilities=null;
}
Project(String name,String startDate,String endDate,String role,String responsibilities[])
{
	this.name=name;
	this.startDate=startDate;
	this.endDate=endDate;
	this.role=role;
	this.responsibilities=responsibilities;
}
void DisplayProject()
{
	System.out.println(name);
	System.out.println(startDate);
	System.out.println(endDate);
	System.out.println(role);
	System.out.println(responsibilities);
}
}