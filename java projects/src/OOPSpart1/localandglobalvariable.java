package OOPSpart1;

public class localandglobalvariable {
	
	int age=25;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1;
		System.out.println(a);
		
		//to call global variable we need to create obj beacse it was a non static variables 
		localandglobalvariable obj=new localandglobalvariable();
		System.out.println(obj.age);
		///int w=obj.net(); //incase of using return in method we need to save value in one more variable like this..
		//System.out.print(w); 
		
		

	}
	public void net()
	{
		int x=10;
		int y=4;
		int z=x+y;
		//return z;
		System.out.print(z);
	}
}
