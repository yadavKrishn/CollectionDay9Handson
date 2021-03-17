package com.handsonday9;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
public class Problem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of keys value you want toEnter");
    int s = sc.nextInt();
    HashMap<Integer, Double> hm = new HashMap<>();
    System.out.println("Enter key Value pairs");
    for (int i = 0; i < s; i++) {
      hm.put((sc.nextInt()), sc.nextDouble());
    }
    System.out.println(display(hm));
  }
  public static String display(HashMap<Integer, Double> hm) {
    double sum = 0;
    int count = 0;
    DecimalFormat df = new DecimalFormat("#0.00");
    Iterator<Integer> it = hm.keySet().iterator();
    while (it.hasNext()) {
      int y = it.next();
      if (y % 2 != 0) {
        sum = (double) (sum + hm.get(y));
        count++;
      }
    }
    double d = sum / count;
    System.out.println("The avg of odd keys:");
    return df.format(d);
  }
}