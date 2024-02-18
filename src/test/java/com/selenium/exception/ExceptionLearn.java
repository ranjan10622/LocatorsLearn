package com.selenium.exception;

public class ExceptionLearn {

	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		
		try
		{
			int c= a/b;
			System.out.println("I have made it done");
			
		}
		
		catch(ArithmeticException er)
		{
			System.out.println(" HERE IS THE ISSUE");
		}
		
		finally
		{
			System.out.println(" This will run irrespective of issues");
		}

	}

}
