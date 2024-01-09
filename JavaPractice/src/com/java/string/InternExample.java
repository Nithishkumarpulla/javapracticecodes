package com.java.string;

public class InternExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="HelloWorld";
String s2=s1.intern();
String s3=new String("HelloWorld");
String s4=s3.intern();
System.out.println(s1==s2);
System.out.println(s1==s3);
System.out.println(s1==s4);
System.out.println(s2==s3);
System.out.println(s2==s4);
System.out.println(s3==s4);
//System.out.println(s3==s3);
	}

}
