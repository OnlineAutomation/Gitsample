package OOPSpart1;

public class Car {

	
	//global varials
	int mod;
	int wheel;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//New is a keyword which is used to create a obj
		//a,b,c is object reference variable
		
	Car a=new Car();
	Car b=new Car();
	Car c=new Car();
	
	
	// var initializion
	
	a.mod=2015;  //calss varialble 
	a.wheel=4;
	
	b.mod=2016;
	b.wheel=4;
	
	c.mod=2017;
	c.wheel=6;
	
	System.out.println("Before shifting the values");
	
	
	System.out.println(a.mod);
	System.out.println(a.wheel);

	System.out.println(b.mod);
	System.out.println(b.wheel);
	

	System.out.println(c.mod);
	System.out.println(c.wheel);
			
	System.out.println("After shifting the object reference varibles");
	
	a=b;
	b=c;
	c=a;
	
	a.mod=10;
	System.out.println(a.mod);  //output 10
	c.mod=20;
	System.out.println(a.mod);  //output 20
	System.out.println(c.mod);  //output 20
	
			
	
	
	
	
	
	
	}

}
