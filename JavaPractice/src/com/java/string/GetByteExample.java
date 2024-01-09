package com.java.string;

public class GetByteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="abcde";
byte b[]=s1.getBytes();
for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
}
String s2=new String(b);
System.out.println(s2);
	}

}
