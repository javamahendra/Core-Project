package com.app;

public class ReverseString {
	
	
	public static String reverseString(String str) {
		
		char[] ch=str.toCharArray();
		String result="";
		for(int i=str.length()-1;i>=0;i--) {
			
			result=result+ch[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println(reverseString("Mahindra Gadiparthi"));
	}

}
