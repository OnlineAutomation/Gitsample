import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value;
		Scanner A=new Scanner(System.in);
		do
		{
		System.out.println("Enter the number :");
		value = A.nextInt();
		}
	
		while ( value !=5);
		{
			System.out.println("Got 5!");
		}
		
	}

}
