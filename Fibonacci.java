package javaproject.sample;

public class Fibonacci {
		static int fib(int number)
		    {
		        int series1 = 0, series2 = 1, series3;
		        if (number == 0)
		            return series1;
		        for (int i = 2; i <= number; i++)
		        {
		        series3 = series1 + series2;
		            series1 = series2;
		            series2 = series3;
		        }
		        return series2;
		    }  
		    public static void main (String args[])
		    {
		    int number = 9;
		    System.out.println(fib(number));
		    }
		}


