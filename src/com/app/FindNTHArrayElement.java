package com.app;

import java.util.Arrays;

public class FindNTHArrayElement {
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,31,52,99,120,35,25,85};
		
		// to find second highest element
				
		Arrays.sort(arr);
		for(int a:arr) {
			System.out.print(a +", ");
		}
		System.out.println();
		System.out.println(arr[arr.length]);		
	}
}
