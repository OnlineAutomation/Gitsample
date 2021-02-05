package OOPSpart1;

public class warraperclass {

	//warraper class used for data conversion 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="200";
		System.out.println(a+100);
		
		// conver string into int using warrper class 
		
		int x= Integer.parseInt(a);
		System.out.println(x+100);
		
	
		//converting int into string 
		
		int j=200;
		
		String s=String.valueOf(j);
		System.out.println(s+100);
		
		
		String w="100a"; //"100a" not a proper number incase of this we will get number format exception
		int n=Integer.parseInt(w);
		
		
	}

}
