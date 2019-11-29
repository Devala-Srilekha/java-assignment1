package printpowerbill;

import java.util.Scanner;

public class Test extends Generatedbill {
	private static Scanner s;

	public static void main (String[] args)
	{
		System.out.println("enter number of units");
		s = new Scanner(System.in);
		double unit = s.nextInt();
				
		
		GenerateBill g=new Test();
		 g.showBill(unit);
			
		
		
		
		
		
	}
	
	}


