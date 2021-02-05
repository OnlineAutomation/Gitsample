package OOPSpart1;

public class callbyvalue {
	
	int p;
	int q;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		callbyvalue obj=new callbyvalue();
		int x=20;
		int y=10;
				
		obj.testsum(x,y);//just passing parameters/value is callled call by values
		
		//call by reference
		obj.p=50;
		obj.q=60;
		
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	public  int testsum(int a,int b)
	{
		 a=30;
		 b=40;
		int c=a+b;
		return c;
	}

	//call by reference 
	
	public void swap(callbyvalue t)
	{
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}
	
}
