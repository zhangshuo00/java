package com.runoob.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Demo {
	//��Ա����
//	String name;
//	String stuNo;
//	int age;
//	
//	void study() {
//		System.out.println("����˯��");
//	}
	public static void main(String[] args) {
		/*int i=10;
		System.out.printf("%d",i);
		System.out.println();//����
		System.out.printf("%4d", i);
		
		float a=1.234f;//�����f
		System.out.printf("%.2f",a);
		System.out.println();//����
		
		char c= 'a';
		System.out.printf("%c",c);
		System.out.println();//����
		
		boolean d=true;
		System.out.printf("%b", d);
		System.out.println();//����
		
		Scanner input = new Scanner(System.in);
		if(input instanceof Scanner) {
			System.out.println("jjj");
		}
		//String str = input.nextLine();//ɨ��һ�У����Ի�ȡ�ո�
		//String str = input.next();//���ܻ�ȡ�����еĿո�
		//System.out.println(str);
		
		/*int num1 = input.nextInt();
		System.out.println(num1);
		int num2 = input.nextInt();
		System.out.println(num2);*/
		/*
		System.out.print("������һ���뾶");
		double radius = input.nextDouble();
		double area = radius*radius*3.14;
		System.out.println("Բ�����Ϊ��"+ area);
		
		final int Max_Num = 10;//���峣��
		
		int n = 10;
		if(n==10) {
			System.out.println(n);
		}*/
		
//		int x=10,y=9;
//		System.out.println(x>y?x:y);//��Ԫ�����������ϴ����
//		int a=-2;
//		System.out.println(a<<3);//���ơ�����
		
		
//		long l1=10L;
//		double d1=10.0;
//		System.out.println(l1 + d1);
		
//		for(int i=0;i<10;i++) {
//			if(i == 5) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		//���������
//		Random ran = new Random();
//		int res = ran.nextInt(100);
//		int num1 = 0;
//		Scanner input = new Scanner(System.in);
//		System.out.println("������һ��������");
//		while(num1 != res) {
//			num1 = input.nextInt();
//			if(num1>res) {
//				System.out.println("biger");
//			}else if(num1 < res) {
//				System.out.println("less");
//			}else if(num1 == res) {
//				System.out.println("right");
//			}
//			
//		}
		
		//����
//		int[] num1 = {1,2,3,4};
//		System.out.println(num1.length);
//		int[] num2 = new int[5];
//		for(int i = 0;i<num2.length;i++) {
//			System.out.println(num2[i]);
//		}
//		boolean[] ch = new boolean[5];
//		for(boolean c:ch) {
//			System.out.println(c);
//		}
		
		//��ά����
//		int [][] nums = {{1,2},{2,4,5}};
//		for(int i=0;i<nums.length;i++) {
//			for(int j=0;j<nums[i].length;j++) {
//				System.out.println(nums[i][j]);
//			}
//		}
//		int[] i2= {1,2,3,4,55,89,33,65,48,91,20};
//		int[] i1 = Arrays.copyOf(i2,i2.length);
//		Arrays.sort(i2);
//		System.out.println(Arrays.);
		
		DemoMonday a = new DemoMonday();
		a.max(10, 20);
		
	}

}
