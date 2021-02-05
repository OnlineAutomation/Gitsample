package OPPSpart2;

import java.util.ArrayList;

public class arraylistprog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList at=new ArrayList();

		at.add(100);
		at.add(200);
		
		
		System.out.println(at.size());
		
		at.add(300);
		at.add(400);
		System.out.println(at.size());
		
		at.add("time");
		System.out.println(at.size());
		System.out.println(at.get(3)); //print the values n postion
		
		//print all values from array list
		
		
		
		for(int i=0; i<at.size();i++)
		{
			//int i;
			System.out.println(at.get(i));
		}
		
		ArrayList<Integer> a1= new ArrayList<Integer>();  //declearing the array list value type
		
		a1.add(100);
		//a1.add("san"); // u cant add other than the integer value in the array list 
			
		ArrayList<String> a2= new ArrayList<String>();	
		a2.add("Santhosh");
		//a2.add(100); we cant add integer value in this array list
		
		
		
		
		//Different b/w and array and arraylist
		
		//Array: Simple fixed sized arrays that we create in Java, like below
	      //int arr[] = new int[10]  
		//ArrayList : Dynamic sized arrays in Java that implement List interface.
	     // ArrayList<Type> arrL = new ArrayList<Type>();
	    //  Here Type is the type of elements in ArrayList to be created
	      
		
		
		//ArrayList is part of collection framework in Java. Therefore array members are accessed using [], 
		//while ArrayList has a set of methods to access elements and modify them.
		
			
	}


	//ArrayList<integer> at=new ArrayList<integer>();
	
	
	
}
