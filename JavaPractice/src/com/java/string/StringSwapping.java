package com.java.string;

public class StringSwapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="Program";
String s2="world";
String s3="";
System.out.println(s1+" "+s2);
//s3=s1;
//s1=s2;
//s2=s3;
s1=s1.concat(s2);
s2=s1.substring(0,s1.length()-s2.length());
s1=s1.substring(s2.length());
System.out.println(s1+" "+s2);
	}

}
