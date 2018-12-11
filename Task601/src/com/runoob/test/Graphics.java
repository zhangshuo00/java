package com.runoob.test;

public abstract class Graphics {
	protected String color;
	protected boolean stuff;
	protected double area;
	protected double perimeter;
	
	//成员属性赋初值
	public Graphics() {}
	public Graphics(String color,Boolean stuff) {
		this.color = color;
		this.stuff = stuff;
	}
	//
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getStuff() {
		return stuff;
	}
	public void setStuff(boolean stuff) {
		this.stuff = stuff;
	}
	//获取图形面积
	public abstract double getArea();
	//获取图形周长
	public abstract double getPerimeter();
	
	public abstract String toString();
}
/*有些基类本身不适合生成对象，所以需要定义为抽象类，抽象类不能实例化对象
 * 抽象类中可以定义抽象方法*/
