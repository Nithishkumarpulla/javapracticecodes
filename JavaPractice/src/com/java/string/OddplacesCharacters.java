package com.java.string;

import java.util.Scanner;

public class OddplacesCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using charAt()
Scanner sc=new Scanner(System.in);
System.out.print("Enter the string: ");
String s=sc.nextLine();
for(int i=0;i<s.length();i++) {
	if(i%2!=0)
	System.out.println(s.charAt(i)+" "+i);
}
sc.close();
	}

}
