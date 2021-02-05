package OPPSpart2;

import java.util.Hashtable;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// hashtable is class and put is method
		//hashtable storing two values one is key and another one is value 
		
		Hashtable h= new Hashtable();
		h.put("a", "Santhosh");
		h.put("b", 8);
		
		
		System.out.println(h.size());
		h.put(4, 6);
		System.out.println(h.size());
		System.out.println(h.get("b"));
		System.out.println(h.get(4));

		Hashtable <Integer,Integer> h1= new Hashtable<Integer,Integer>();
		h1.put(4, 6);
		
	}
	

}
