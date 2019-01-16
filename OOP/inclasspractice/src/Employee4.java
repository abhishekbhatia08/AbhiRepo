public class Employee4
{
	String name;
	String address;
	int yearOfJoining;
	Employee4()
	{
		name = "";
		address = "";
		yearOfJoining = 0;
	}
	void displayInfo()
	{
		System.out.println(this.name+"\t\t"+this.yearOfJoining+"\t\t"+this.address+"\n");
	}

}