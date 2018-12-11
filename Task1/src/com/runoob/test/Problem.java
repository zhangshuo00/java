package com.runoob.test;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		System.out.println("姓名：张朔");
		System.out.println("学号：2017012067");
		System.out.println("班级：2017级软件工程8班");
		
		
		for(int a = 1;a<=100;a++){
			if(a%3==0 && a%2!=0) {
				System.out.println(a);
			}
		}
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("请输入第一个操作数");
		double one = s.nextDouble();
		
		System.out.println("请输入运算符");
		String oper = s.next();
		
		System.out.println("请输入第二个操作数");
		double two = s.nextDouble();
		
		double result;
		if(oper.equals("+")) {
			result = one + two;
			System.out.println(result);
		}else if(oper.equals("-")){
			result = one - two;
			System.out.println(result);
		}else if(oper.equals("*")) {
			result = one * two;
			System.out.println(result);
		}else if(oper.equals("/")) {
			result = one / two;
			System.out.println(result);
		}
		
	}

}
