package com.runoob.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle();
		c1.setRadius(10.0);//set–¥»Î ˝æ›
		String a = c1.toString();
		System.out.println(a);
		
		Rectangle r1 = new Rectangle();
		r1.setSideLength1(3.0);
		r1.setSideLength2(4.0);
		String b = r1.toString();
		System.out.println(b);
		
		Square s1 = new Square();
		s1.setSideLength(5.0);
		String c = s1.toString();
		System.out.println(c);
		
	}

}
