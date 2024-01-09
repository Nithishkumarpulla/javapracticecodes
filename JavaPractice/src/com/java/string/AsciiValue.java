package com.java.string;

import java.util.Scanner;

public class AsciiValue {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s=sc.nextLine();
//		byte[] bytes = s.getBytes();
//        System.out.println("Default Encoding:");
//        for (byte b : bytes) {
//            System.out.print(b + " ");
//         }
  for(int i=0;i<s.length();i++) {
	char ch=s.charAt(i);
	int asciivalue=(int)ch;
	System.out.println(asciivalue);
}
  sc.close();
	}

}
