package taxcalculation;
import java.util.Scanner;

public  class Test {
	private static Scanner sc;

	public static void main(String[] args)
	{
		
		Calculation c= new Calculation();
		
		System.out.println("Enter CTC of employee:");
		sc = new Scanner(System.in);
		int ctc=sc.nextInt();
		 c.esiCalculation(ctc);
		 c.pfCalculation(ctc);
		 c.ptCalculation(ctc);
		 c.incometaxCalculation(ctc);
		 c.rebate(ctc);
		 c.empNetSalary(ctc);
	}


}
