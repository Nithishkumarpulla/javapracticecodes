package com.java.string;

public class StringJoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String joinString1="abc";
		System.out.println(joinString1);
		joinString1=String.join("-","welcome","to","javatpoint");  
		System.out.println(joinString1);  
		String date = String.join("/","25","06","2018");    
        System.out.print(date);    
        String time = String.join(":", "12","10","10");  
        System.out.println(" "+time); 
	}

}
