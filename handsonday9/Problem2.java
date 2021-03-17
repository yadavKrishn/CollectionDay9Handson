package com.handsonday9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class UserMainCode2{
	public static int removeElement(HashMap<Integer,String>hm)
	{
		int k,count=0;
		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext())
		{
			k=it.next();
			if(k%3!=0)
				count++;
			}
		return count;
	}
	
}
public class Problem2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		for (int i=0;i<n;i++)
		{
			hm.put(in.nextInt(), in.next());
		}
		System.out.println(UserMainCode2.removeElement(hm));
	}

}
