package com.java.string;

public class ContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Helloworld";  
		 boolean isContains = str.contains("Javatpoint");  
	        System.out.println(isContains);  
		// comparing a string to null  
		if(str.contains("hello"))  
		{  
		System.out.println("Inside the if block");  
		}  
		else  
		{  
		System.out.println("Inside the else block");  
		}  
	}
 
} 
