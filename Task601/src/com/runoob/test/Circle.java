package com.runoob.test;

public class Circle extends Graphics{
	private double radius;
	
	//
	public Circle() {}
	public Circle(String color,Boolean stuff,double radius) {
		super(color,stuff);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//
	public double getArea() {
		return radius*radius*3.14;
	}
	public double getPerimeter() {
		return 2*3.14*radius;
	}
	//
	public String toString() {
		//return "color: "+color+" �Ƿ����: "+stuff;
		return "��ɫ: "+color+" �Ƿ����: "+stuff+" �뾶 = "+radius;
	}
}
