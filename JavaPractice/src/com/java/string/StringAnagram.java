package com.java.string;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Enter 1st string: ");
String s1=sc.next().toLowerCase().replaceAll("\\s","");
char ch1[]=s1.toCharArray();
System.out.print("Enter 2st string: ");
String s2=sc.next().toLowerCase().replaceAll("\\s","");
char ch2[]=s2.toCharArray();
boolean s=true;
if(s1.length()!=s2.length()) {
	s=false;
}else {
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	s=Arrays.equals(ch1, ch2);
	System.out.println(s);
}
sc.close();
	}

}
