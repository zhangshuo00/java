package com.runoob.test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		boolean d = input.hasNext();
		
		MyTime m1 = new MyTime();
		m1.setHour(a);
		m1.setMinute(b);
		m1.setSecond(c);
		m1.setDecimal(d);
		
		String s = m1.toString(a,b,c,d);
		System.out.println(s);
	}

}
