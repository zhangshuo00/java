package com.runoob.test;

public class Circle {
	private double radius;//隐藏实现细节，保证数据的安全性
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double caculatePerimete() {//求周长
		return 3.14*2*radius;
	}
	public double caculateArea() {//求面积
		
		return 3.14*radius*radius;
	}
	public String toString() {//生成字符串
		double per = caculatePerimete();
		double area = caculateArea();
		return "radius="+radius+" perimete="+per+" area="+area;
	}
}