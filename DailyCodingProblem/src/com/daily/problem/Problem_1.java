package com.daily.problem;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
Good morning! Here's your coding interview problem for today.

This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass? 
 */

public class Problem_1 {
	
	public static void getPair(List<Integer> list, int k) {
		Set<Integer> s = new HashSet<Integer>();
		for(Integer n : list) {
			int a = k-n;
			if(s.contains(a)) {
				System.out.println(a+","+n);
			}
			s.add(n);
		}
	}
}
