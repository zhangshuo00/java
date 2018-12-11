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
		//任务01
//		int i,j,sum;
//		for(i=1;i<9;i++) {
//			for(j=1;j<=i;j++) {
//				sum = i*j;
//				System.out.print(i + "*" + j + "=" + sum + "\t");
//			}
//			System.out.println();
//		}
		
		//任务02
//		Scanner s = new Scanner(System.in);
//		System.out.println("请输入第一个数：");
//		double a = s.nextDouble();
//		System.out.println("请输入第二个数：");
//		double b = s.nextDouble();
//		System.out.println("请输入第三个数：");
//		double c = s.nextDouble();
//		if(a == b && b==c && a==c) {
//			System.out.println("所有数值均相等");
//		}else if(a!=b && b!=c && c!=a) {
//			System.out.println("所有数值均不等");
//		}else {
//			System.out.println("不是所有值都相等或不等");
//		}
		
		//任务03
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
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
		System.out.println("数据和："+sum);
		//数组的复制
		int[] c = Arrays.copyOf(a,a.length);
		String[] d = Arrays.copyOf(b, b.length);
		//输出
		System.out.print("整型数组原始数据：[");
		outPut(a);
		System.out.print("排序后：[");
		Arrays.sort(a);
		outPut(a);
		System.out.print("字符串数组原始数据：[");
		outPutString(b);
		System.out.print("排序后：[");
		Arrays.sort(b);
		outPutString(b);
}
}
