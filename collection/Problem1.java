package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		int b=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of matches");
		int n=sc.nextInt();
		List<Integer> l=new ArrayList<>();
		System.out.println("Enter the runs in each match");
		for(int i=0;i<n;i++) {
			 int intValue = sc.nextInt();
		        l.add(intValue);
		}
		for(int i=0;i<n;i++) {
			int a=l.get(i);
			b+=a;
			}
		System.out.println("Total: "+b);
	}

}
