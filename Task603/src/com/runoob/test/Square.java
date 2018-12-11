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
	//获取面积及周长
	public double getArea() {
		return sideLength*sideLength;
	}
	public double getPerimeter() {
		return sideLength*4;
	}
	//
	public String toString() {
		return "颜色: "+color+" 是否填充: "+stuff+" 边长 = "+sideLength;
	}
}
