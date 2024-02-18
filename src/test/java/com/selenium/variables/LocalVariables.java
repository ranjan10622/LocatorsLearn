package com.selenium.variables;

public class LocalVariables {
	
	   static String name;
	  String email;
	  String college;
	
	LocalVariables(String email, String college)
	{
		
		
		  this.email=email;
		   this.college= college;
		
	}
	   
	public void printValue()
	{
		System.out.println(" My name is "+ ""+ "Ranjan");
		System.out.println("My email is "+ ""+ email);
		System.out.println("My college name is "+ ""+ college);
	}

	public static void main(String[] args) {
		
		LocalVariables obj1 = new LocalVariables("ranjan09mohan@gmail.com","Atria Institute Of Technology");
		  obj1.printValue();

	}

}
