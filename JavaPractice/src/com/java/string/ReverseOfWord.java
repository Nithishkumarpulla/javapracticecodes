package com.java.string;

import java.util.Scanner;

public class ReverseOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s=sc.nextLine();
		String[] words=s.split(" ");
		String rev="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revword="";
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}
			rev=rev+revword+" ";
		} 
		System.out.println("Original String: "+s);
		System.out.println("Reversed String: "+rev);
		sc.close();
	}

}
