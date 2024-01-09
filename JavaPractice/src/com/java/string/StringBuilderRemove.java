package com.java.string;

public class StringBuilderRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder s1=new StringBuilder();
s1.append("Hello");
s1.append("world");
s1.insert(3,"hi");
System.out.println(s1);
//s1.deleteCharAt(5);
s1.delete(3, 6);
System.out.println(s1);
	}

}
