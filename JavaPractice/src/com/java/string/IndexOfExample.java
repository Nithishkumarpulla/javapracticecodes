package com.java.string;

public class IndexOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Welcome to the capgemini!";
int a1=s.indexOf('W');
int a2=s.indexOf('t',7);
int a3=s.indexOf("come");
int a4=s.indexOf("to", 15);
int a5=s.lastIndexOf('c');
int a6=s.lastIndexOf('t',10);
int a7=s.lastIndexOf("the");
int a8=s.lastIndexOf("to",7);
System.out.println(a1+"\n"+a2+"\n"+a3+"\n"+a4);
System.out.println(a5+"\n"+a6+"\n"+a7+"\n"+a8);
	}

}
