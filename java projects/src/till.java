import java.util.Scanner;

public class till {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner E=new Scanner(System.in);
		System.out.println("Enter any Int value");
		int i=E.nextInt();
		int S=0;
		while (S<i)
		{
			System.out.println("Printing the same line based on the user input, " +"Line number :" +S);
			S++;
		}
			
	}

}
