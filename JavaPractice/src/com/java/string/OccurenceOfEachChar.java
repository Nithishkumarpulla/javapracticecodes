package com.java.string;
import java.util.Scanner;
public class OccurenceOfEachChar {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //using toCharArray()
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s=sc.nextLine();
		int charCount[]=new int[256];	
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			charCount[s.charAt(i)]++;
		}
//		for(char c:s.toCharArray()) {
//			charCount[c]++;
//		}
		for (int i = 0; i < charCount.length; i++) {
            if (charCount[i]==1) {
                System.out.println("Character: " +  (char)i + ", Count: " + charCount[i]);
            }
            
		}
		sc.close();
	}
}