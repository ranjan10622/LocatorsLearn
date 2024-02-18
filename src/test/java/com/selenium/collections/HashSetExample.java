package com.selenium.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		    hs.add("USA");
		    hs.add("UK");
		    hs.add("SWITZERLAND");
		    hs.add("UK");
		    
		    System.out.println(hs);
		    
		    System.out.println(hs.remove("USA"));
		     System.out.println(hs);
		    System.out.println(hs.isEmpty());
		    
		    //iterator concept
		    
		    Iterator<String> i = hs.iterator();
		     while(i.hasNext())
		     {
		    	 System.out.println(i.next());
		     }
		 
		      

	}

}
