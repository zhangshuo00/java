package com.runoob.test;

public class Square extends Graphics{
	private double sideLength;
	public Square() {}
	public Square(String color,Boolean stuff,double sideLength) {
		super(color,stuff);
		this.sideLength = sideLength;
	}
	public double getSideLength() {
		return sideLength;
	}
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
	//��ȡ������ܳ�
	public double getArea() {
		return sideLength*sideLength;
	}
	public double getPerimeter() {
		return sideLength*4;
	}
	//
	public String toString() {
		return "��ɫ: "+color+" �Ƿ����: "+stuff+" �߳� = "+sideLength;
	}
}
