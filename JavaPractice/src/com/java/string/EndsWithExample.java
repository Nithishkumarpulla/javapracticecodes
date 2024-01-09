package com.java.string;

public class EndsWithExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Capgemini"; 
		System.out.println(str.startsWith(""));
		System.out.println(str.startsWith("Welcome"));
		System.out.println(str.endsWith("Capgemini "));
		System.out.println(str.endsWith(""));    
 		System.out.println(str.endsWith(" "));  
		  
		}  
	}