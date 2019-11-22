package omniwyse.Assignments;

public class Program3Gcd {
	
	    // extended Euclidean Algorithm
	    public static int gcd(int divider, int remainder)
	    {
	        if (divider == 0)
	            return remainder;
	         
	        return gcd(remainder % divider, divider);
	    }

}
