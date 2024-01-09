package com.java.string;

public class StringFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=String.format("%s","rhea");//string literal
String s2=String.format("%d",100);//integer value
String s3=String.format("%c",'w');//character
String s4=String.format("|%10d|",10);
System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
	}
 
}
