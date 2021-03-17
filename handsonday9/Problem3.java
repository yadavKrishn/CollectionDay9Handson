package com.handsonday9;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class UserMainCode{
	public static String getMaxKeyValue(HashMap<Integer,String>hm)
	{
		int max=0;
		String s2="";
		Iterator<Integer> it=hm.keySet().iterator();
		while(it.hasNext())
		{
			int a=it.next();
			if(a>max)
			{
				max=a;
				String s3=hm.get(a);
				s2=s3;
				
			}
		}
		return s2;
	}
	
}
public class Problem3 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		for (int i=0;i<n;i++)
		{
			hm.put(in.nextInt(), in.next());
		}
		System.out.println(UserMainCode.getMaxKeyValue(hm));
	}

}
