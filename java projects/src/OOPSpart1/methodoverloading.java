package OOPSpart1;

public class methodoverloading {
	
	//method overloaading-- when the method name is same with different input parameters /argument within the same class is called method overloading

	//you cant create method inside a method
	
	//duplicate method --ie same method name with same input parameters are not allowed
	//method name with same number of input parameter with same data type not allowed
	//ie int a and int b not allowed
	//same number of parameters and different data types allowed 
	
	//* we can overload main method also
	
	
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		methodoverloading obj=new methodoverloading();
		obj.sum();
		obj.sum(2);
		obj.sum(2, 3);
		
	}
	
	public static void main(int a)
	{
		
	}
	
	public void sum()
	{
		System.out.println("No parameter");
		
	}
	public void sum(int i)
	{
		System.out.println("with one input parameter"+ i);
		
	}
	public void sum(int i ,int j)
	{
		System.out.println("with two input parameter"+i+j);
		
	}

}
