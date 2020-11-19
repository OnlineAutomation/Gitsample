import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner A=new Scanner(System.in);
		System.out.println("Enter Any value");
		int values=A.nextInt();
		
		switch (values)
		{
		 case 1:
		 {
			 System.out.println("Printed one");
		 }
		 default:
		 {
			 System.out.println("INvalid"); 
		 }
			 
		 
		}
		
		
	}

}
