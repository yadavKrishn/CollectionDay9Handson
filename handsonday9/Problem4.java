package com.handsonday9;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Problem4 {
 
	public static Scanner sc;
 
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int k1 = Integer.parseInt(sc.nextLine());
		LinkedHashMap<String, String> hm = new LinkedHashMap<String, String>();
		for (int i = 0; i < k1; i++) 	{
			String k = sc.nextLine();
			String s = sc.nextLine();
			hm.put(k, s);
		}
		String n = sc.nextLine();
		LinkedHashMap<String, String> hm1 = new LinkedHashMap<String, String>();
		hm1 = dis(hm, n);
		Iterator<String> it = hm1.keySet().iterator();
 
		while (it.hasNext()) {
			String s2 = it.next();
			System.out.println(s2);
		}
}
 
	public static LinkedHashMap<String, String> dis(LinkedHashMap<String, String> h1, String n) {
		int k = 0;
		LinkedHashMap<String, String> hm1 = new LinkedHashMap<String, String>();
		Iterator<String> it = h1.keySet().iterator();
		while (it.hasNext()) {
			String s2 = it.next();
			String s3 = h1.get(s2);
			if (s3.equals(n))
				hm1.put(s2, s3);
		}
		return hm1;
}
 
}