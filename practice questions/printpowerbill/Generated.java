package printpowerbill;
import java.util.Scanner;

public class Generated {
	public static Scanner s;
	public static double bill;
	public static void main(String[] args)
	{
		System.out.println("enter the number of units");
		s=new Scanner(System.in);
		double unit=s.nextDouble();
		
		if(unit<100)
		{
			bill=(double)(unit*2.50);
			System.out.println("enter the bill:" +bill);
			
		}
		if(unit>=100 & unit<500)
		{
			bill=(unit-100)*3.00;
			System.out.println((100*2.50)+bill);
			
		}
		if(unit>=500)
		{
			bill=(unit-500)*4.50;
			System.out.println((100*2.50)+(400*3.00)+bill);
		}
	}
}
