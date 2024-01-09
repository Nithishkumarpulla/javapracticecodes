package com.java.string;

import java.util.Stack;

public class StringRevUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Hello World";
Stack<Character> st=new Stack<>();
for(int i=0;i<s.length();i++) {
	st.push(s.charAt(i));
}
StringBuilder rev=new StringBuilder();
for(int i=st.size();i>0;i--) {
	rev.append(st.pop());
}
//while(!st.isEmpty()) {
//	rev.append(st.pop());
//}
System.out.println(rev.toString());
	}
 
}
