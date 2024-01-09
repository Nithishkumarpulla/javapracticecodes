package com.java.string;

import java.util.StringJoiner;

public class StringPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringJoiner s=new StringJoiner(":","[","]");
s.add("abc");
s.add("efg");
s.add("ghi");
System.out.println(s);
	}

}
