package OPPSpart2;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		hdfc h=new hdfc();
		h.carloan();
		h.credit();
		System.out.println(h.minbal);
		
		int a=10;
		int b=20;
		
		
		
		//dynamic polypharmism
		//child class obj can be refered by parent interface reference variable
		//we can access nly overridden  methods 
		
		usbank h1=new hdfc();
		h1.credit();
	
 
	}

}
