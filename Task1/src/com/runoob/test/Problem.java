package com.runoob.test;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		System.out.println("��������˷");
		System.out.println("ѧ�ţ�2017012067");
		System.out.println("�༶��2017���������8��");
		
		
		for(int a = 1;a<=100;a++){
			if(a%3==0 && a%2!=0) {
				System.out.println(a);
			}
		}
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("�������һ��������");
		double one = s.nextDouble();
		
		System.out.println("�����������");
		String oper = s.next();
		
		System.out.println("������ڶ���������");
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
