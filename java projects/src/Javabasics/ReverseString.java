package Javabasics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="Santhosh";
		char[] out=input.toCharArray();
		
		for(int i=out.length-1;i>=0;i--)
			System.out.print(out[i]);

		
		
	}

}
