package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of matches Played by CSK");
		int n=sc.nextInt();
		List<String> l=new ArrayList<>();
		System.out.println("Enter the Venues Name");
		for(int i=0;i<=n;i++) {
			 String stringValue = sc.nextLine();
		        l.add(stringValue);
		        }
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Venue name to find its frequency");
		String n1=sc1.nextLine();
		System.out.println(Collections.frequency(l,n1 ));
			}
	

}
