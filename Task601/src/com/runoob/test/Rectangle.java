package com.runoob.test;

public class Rectangle extends Graphics{
	//长方形类
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
	//获取面积及周长
	public double getArea() {
		return length*width;
	}
	public double getPerimeter() {
		return (length+width)*2;
	}
	//
	public String toString() {
		return "颜色: "+color+" 是否填充: "+stuff+" 长 = "+length+"宽 = "+width;
	}
}
