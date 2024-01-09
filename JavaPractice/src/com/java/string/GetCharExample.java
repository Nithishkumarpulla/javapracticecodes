package com.java.string;

public class GetCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Welcome to Capgemini!";
char ch[]=new char[25];
s.getChars(2, 10, ch,0);
System.out.println(ch);
	}

}
