package com.java.string;

import java.util.Scanner;

public class RemovalOfDuplicates {
public static String removeDuplicates(String str) {
	char ch[]=str.toCharArray();
	int length=str.length();
	for(int i=0;i<length;i++) {
		for(int j=i+1;j<length;j++) {
			if(ch[i]==ch[j]) {
				for(int k=j;k<length-1;k++) {
					ch[k]=ch[k+1];
				}
				length--;
				j--;
			}
	 	}
	}
	return new String(ch,0,length);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String s=sc.nextLine();
		String res=removeDuplicates(s);
		System.out.println("After removing duplicates: "+ res);
		sc.close();
	}

}
