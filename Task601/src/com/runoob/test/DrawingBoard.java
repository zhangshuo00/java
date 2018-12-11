package com.runoob.test;

public class DrawingBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle[] circle = new Circle[3];
		Circle c1 = new Circle("green",true,3.0);
		
		Square[] square = new Square[3];
		Square s1 = new Square("yellow",false,4.0);

		Rectangle[] rectangle = new Rectangle[4];
		Rectangle r1 = new Rectangle("red",false,10.0,5.0);
		
		System.out.println(c1.toString());
		System.out.println("圆的面积："+c1.getArea());
		System.out.println("圆的周长："+c1.getPerimeter());
		
		System.out.println(s1.toString());
		System.out.println("正方形的面积："+s1.getArea());
		System.out.println("正方形的周长："+s1.getPerimeter());
		
		System.out.println(r1.toString());
		System.out.println("长方形的面积："+r1.getArea());
		System.out.println("长方形的周长："+r1.getPerimeter());
		
	}

}
