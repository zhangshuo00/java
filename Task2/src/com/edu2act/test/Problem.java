package com.edu2act.test;

import java.util.Arrays;
import java.util.Scanner;

public class Problem {
	public static void outPut(int[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("]");
	}
	public static void outPutString(String[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		//����01
//		int i,j,sum;
//		for(i=1;i<9;i++) {
//			for(j=1;j<=i;j++) {
//				sum = i*j;
//				System.out.print(i + "*" + j + "=" + sum + "\t");
//			}
//			System.out.println();
//		}
		
		//����02
//		Scanner s = new Scanner(System.in);
//		System.out.println("�������һ������");
//		double a = s.nextDouble();
//		System.out.println("������ڶ�������");
//		double b = s.nextDouble();
//		System.out.println("���������������");
//		double c = s.nextDouble();
//		if(a == b && b==c && a==c) {
//			System.out.println("������ֵ�����");
//		}else if(a!=b && b!=c && c!=a) {
//			System.out.println("������ֵ������");
//		}else {
//			System.out.println("��������ֵ����Ȼ򲻵�");
//		}
		
		//����03
		int[] a = {1789,2035,1899,1456,2013,1458,2458,1254,1472,2365};
		String[] b = {"Java","Python","PHP","C#","C Programming","C++"};
		
		
		int i,k,sum=0;
		int max=a[0];
		int min=a[0];
		for(i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}else if(a[i]<min) {
				min = a[i];
			}
		}
		for(i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println("���ֵ��"+max);
		System.out.println("��Сֵ��"+min);
		System.out.println("���ݺͣ�"+sum);
		//����ĸ���
		int[] c = Arrays.copyOf(a,a.length);
		String[] d = Arrays.copyOf(b, b.length);
		//���
		System.out.print("��������ԭʼ���ݣ�[");
		outPut(a);
		System.out.print("�����[");
		Arrays.sort(a);
		outPut(a);
		System.out.print("�ַ�������ԭʼ���ݣ�[");
		outPutString(b);
		System.out.print("�����[");
		Arrays.sort(b);
		outPutString(b);
}
}
