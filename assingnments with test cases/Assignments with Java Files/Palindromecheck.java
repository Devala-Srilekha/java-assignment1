package omniwyse.Assignments;


public class Palindromecheck {
	   public static boolean isPalindrome(String String)
	   {
		   if(String.length()==0 || String.length()==1)
			   return true;
		   if(String.charAt(0)==String.charAt(String.length()-1))
			   return isPalindrome(String.substring(1,String.length()-1));
		   return false;
	   
	    }
	}


