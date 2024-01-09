package com.java.string;

import java.util.ArrayList;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str1 = "Mukesh"; 
		 String s=new String("Mukesh");
		 System.out.println(str1.equals(s));
			
	       ArrayList<String> list = new ArrayList<>();  
	        list.add("Ravi");   
	        list.add("Mukesh");  
	        list.add("Ramesh");  
	        list.add("Ajay");  
	        for (String str : list) {  
	            if (str.equals(str1)) {  
	                System.out.println("Mukesh is present");  
	            }  
	        }  
	}

}
