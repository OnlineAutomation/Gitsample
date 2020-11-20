package OOPSpart1;

public class functionsinjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main method is void it ever return values

		functionsinjava obj=new functionsinjava();
		//obj is the bject reference variable
		//after creating the object,all non static  methods will be given to this object
		//object cant hold static method 
		//non static method any class we can use object
		//if u want to call non static method we need to create objects
		obj.test();
		int n=obj.add();
		System.out.println(n);
		
		String s=obj.name();
		System.out.println(s);
		int d=obj.division(10, 2);
		System.out.println(d);
		
	}
	
	//Non static methods -dones not have ststic keyword while creating the method 
	
	//void -does not return any value
	//return type=void
	//methodname =test
	public void test() //no input no  output
	{
		System.out.println("testmethod");
		
	}
	
	//return type=int
	public int add()  //public returntype method name
	{
		//no input some output
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
			
	}
	
	public String name() {
		
		//no input some output
		
		String s="Santhosh";
		return s;
	}
	//x,y are input parameters
	//some input  some output
	
	public int division(int x,int y) {
		int d=x/y;
		return d;
	}

}
