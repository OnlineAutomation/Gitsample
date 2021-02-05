package OPPSpart2;

public class cartest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//compile time Polymorphism  /static Polymorphism --
		BMW b =new BMW();
		b.start();
		b.carstop();
		
		 //parent class cannot inhernit child class objects 
		car c=new car();
		c.start();
		c.carstop();

		//child call as obj can be refered by parent class reference varible is 
		//called dynamic Polymorphism /run time Polymorphism
		//using this we can access overridden methods and parent class methosds only 
		//we cant access child class method 
		//this is called top casting
		
		car c1=new BMW();
		c1.start();
		c1.carstop();
		
		
		//down casting 
		
		BMW b1=(BMW) new car();
		
	}

}
