package OPPSpart2;

public class BMW extends car {
	
	
	
	//when parent class and child class will have same class name and same arguments,
	//java compiler will giver preferances to the child class(over written method), this is called as method method overriding
	//
	public void start() //over written method
	{
		System.out.println("BMW start");
	}

	public void stop() {
		System.out.println("BMW stop");
	}

}
