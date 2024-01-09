package com.java.string;

import java.util.Scanner;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] r=s.split(",");
        String[] r1=s.split("\\.");
        String[] r2=s.split(":");
        String[] r3=s.split(";");
        String[] r4=s.split("_");
        String[] r5=s.split(" ");
        String[] r6=s.split("\s");
        String[] r7=s.split("\t");
        String[] r8=s.split("\n");
        for(String ss:r3) {
            System.out.println(ss);
        }
sc.close();
	}
}
