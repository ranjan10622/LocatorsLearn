package com.selenium.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<String> str = new ArrayList<String>();
		  str.add("Ranjan");
		  str.add("Java");
		  str.add(1, "Mohan");
		  
		  System.out.println(str);
		  
		  
		/*  str.remove(1);
		  
		  System.out.println(str);
		 str.remove("Java");
		  
		  System.out.println(str);
		  
		  str.removeAll(str);
		  
		  System.out.println(str);
		  
		  */
		System.out.println(str.get(2));
		
		System.out.println(str.contains("baba"));
		
		System.out.println(str.indexOf("Java"));
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.size());

	}

}
