package printpowerbill;

public  class Generatedbill implements GenerateBill
{

	public void showBill(double unit) {
	
	
	
		
	if(unit<=100)
	{
		
		System.out.println(unit*2.50);
		
	}
	if(unit>100  && unit<=500)
	
	{

		System.out.println((100*2.50)+((unit-100)*3.0)); 
	}
	if(unit>500)
	{

		System.out.println((100*2.50)+(400*3.0)+((unit-500)*4.5));
	}

		}
	
}
	



