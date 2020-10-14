package com.daily.problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*

Good morning! Here's your coding interview problem for today.

This problem was asked by Uber.

Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
 */

public class Problem_2 {
	
	public static void getProduct(int ar[]) {
		int left[] = new int[ar.length];
		int right[] = new int[ar.length];
		int result[] = new int[ar.length];
		
		left[0] = 1;
		right[ar.length-1] = 1;
		
		
		for(int i=1;i<ar.length;i++) {
			left[i] = left[i-1] * ar[i-1]; 
		}
		
		for(int i=ar.length-2;i>=0;i--) {
			right[i] = right[i+1] * ar[i+1]; 
		}
		
		for(int i=0;i<ar.length;i++) {
			result[i] = left[i] * right[i];		
			}
		
		System.out.println(Arrays.toString(result));
	
	}
}
