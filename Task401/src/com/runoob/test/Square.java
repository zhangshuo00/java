package com.runoob.test;

public class Square {
	private double sideLength;
	
	public double getSideLength() {
		return sideLength;
	}
	public void setSideLength(double s) {
		sideLength = s;
	}
	public double caculatePerimete() {
		return sideLength*4;
	}
	public double caculateArea() {
		return sideLength*sideLength;
	}
	public String toString() {
		double per = caculatePerimete();
		double area = caculateArea();
		return "sideLength="+sideLength+" perimete="+per+" area="+area;
	}
}
