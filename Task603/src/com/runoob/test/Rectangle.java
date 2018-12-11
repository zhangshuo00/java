package com.runoob.test;

public class Rectangle extends Graphics{
	//��������
	private double length;
	private double width;
	
	public Rectangle() {}
	public Rectangle(String color,Boolean stuff,double length,double width) {
		super(color,stuff);
		this.length = length;
		this.width = width;
	}
	//
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	//��ȡ������ܳ�
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return (length+width)*2;
	}
	//
	public String toString() {
		return "��ɫ: "+color+" �Ƿ����: "+stuff+" �� = "+length+"�� = "+width;
	}
}
