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
		System.out.println("Բ�������"+c1.getArea());
		System.out.println("Բ���ܳ���"+c1.getPerimeter());
		
		System.out.println(s1.toString());
		System.out.println("�����ε������"+s1.getArea());
		System.out.println("�����ε��ܳ���"+s1.getPerimeter());
		
		System.out.println(r1.toString());
		System.out.println("�����ε������"+r1.getArea());
		System.out.println("�����ε��ܳ���"+r1.getPerimeter());
		
	}

}
