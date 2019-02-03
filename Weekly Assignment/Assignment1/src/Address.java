class Address{
String line1;
String line2;
String city;
String state;
int pinCode;
Address(){
	line1="";
	line2="";
	city="";
	state="";
	pinCode=0;
}
Address(String line1,String line2,String city,String state,int picode){
	this.line1=line1;
	this.line2=line2;
	this.city=city;
	this.state=state;
	this.pinCode=pinCode;
}
void DisplayAddress(){
	System.out.println(line1);
	System.out.println(line2);
	System.out.println(city);
	System.out.println(state);
	System.out.println(pinCode);
}
}