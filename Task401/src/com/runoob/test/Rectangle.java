package com.runoob.test;

public class Rectangle {
	private double sideLength1;
	private double sideLength2;
	
	public double getSideLength1() {
		return sideLength1;
	}
	public double getSideLength2() {
		return sideLength2;
	}
	public void setSideLength1(double l1) {
		sideLength1 = l1;
	}
	public void setSideLength2(double l2) {
		sideLength2 = l2;
	}
	public double caculateSquarePerimete() {
		return (sideLength1+sideLength2)*2;
	}
	public double caculateSquareArea() {
		return sideLength1*sideLength2;
	}
	public String toString() {
		double per = caculateSquarePerimete();
		double area = caculateSquareArea();
		return "sideLength1="+sideLength1+" sideLength2="+sideLength2+" perimete="+per+" area="+area;
	}
}
