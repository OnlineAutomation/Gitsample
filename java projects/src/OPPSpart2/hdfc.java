package OPPSpart2;

public class hdfc implements usbank, icicibank //multiple inhertiance when child have multiple parent	

{

	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("HDFC ---credit");
		
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		
		System.out.println("HDFC ---debit");
	}

	@Override
	public void transfer() {
		// TODO Auto-generated method stub
		System.out.println("HDFC ---Transfer");
	}

	
	//seperate method 
	public void personalloan()
	{
		System.out.println("Hdfc-persnal loan");
	}
	
	public void carloan()
	{
		System.out.print("HDFC_car loan");
	}

	//override method from icici bank
	@Override
	public void payment() {
		// TODO Auto-generated method stub
		
		System.out.println("Payment from ICICI bank");
		
	}
	
}
