class Student{
	int i;
	int j;
	int k;
	String firstName;
	String lastName;
	Address addr;
	String dob;
	String[] skills;
	Qualification qual[];
	Project projects[];
	String eMail;
	String contactNo;
	Student(){
		firstName=" ";
		lastName= " ";
		addr=null;
		dob=" ";
		eMail=" ";
		contactNo=" ";
		skills=null;
		projects=null;
		qual=null;

	} 
	Student(String firstName,String lastName,Address addr,String dob,String skills[],Qualification qual[],Project projects[],String eMail,String contactNo){
		this.firstName=firstName;
		this.lastName=lastName;
		this.addr=addr;
		this.dob=dob;
		this.skills=skills;
		this.qual=qual;
		this.projects=projects;
		this.eMail=eMail;
		this.contactNo=contactNo;
	}
	void DisplayStudent(){
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(addr);
		System.out.println(dob);
		for(j=0;j<skills.length;j++)
		{
		System.out.println(skills);
		}
		for(i=0;i<qual.length;i++)
		{
		qual[i].DisplayQual();
	}
	for(k=0;k<projects.length;k++)
	{
		projects[i].DisplayProject();
	}
		System.out.println(eMail);
		System.out.println(contactNo);

	}
}