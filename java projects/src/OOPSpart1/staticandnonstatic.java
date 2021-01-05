package OOPSpart1;

public class staticandnonstatic {
	
	
	//global variable -avaliable accross the all function or method with some condition 
	
	String name="Santhosh"; //non static global variable
	static int num=2;//static global variable

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//static /seperate memory for static var and methods
		//for non static methods and var we need to create objects then only we can access the file
		//how to call static methods and variales
		// method direct calling 
		sum();
		//method calling by class name 
		staticandnonstatic.sum();
		
		//varible direct calling
		System.out.println(num);
		
		//var calling by classname 
		System.out.println(staticandnonstatic.num);
		
		//---------------------------------------non static----------------------
		
		//how to create a non static variable and method
		
		staticandnonstatic var= new staticandnonstatic();
		System.out.println(var.name);
		var.sendmail();
		
		//can i access static method using obj reference ? Yes
		
		var.sum();  //it not a good practice becase static var/method directly avalible in java memory .
		//then what is the need of creating obj to access static method/var
		 				

	}
	
	public void sendmail()
	{
		System.out.println("send mail method");
		
	}
	public static void sum()
	{
		System.out.println("sum method");
		
	}

}
