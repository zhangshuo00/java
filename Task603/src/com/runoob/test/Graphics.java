package com.runoob.test;

public abstract class Graphics implements Comparable{
	protected String color;
	protected boolean stuff;
	protected double area;
	protected double perimeter;
	
	//��Ա���Ը���ֵ
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
	
	//��ȡͼ�����
	public abstract double getArea();
	//��ȡͼ���ܳ�
	public abstract double getPerimeter();
		
	public abstract String toString();
	
	public int comparableTo(Graphics graphics) {
		if(graphics.getArea()>getArea()) {
			return 1;
		}else if(graphics.getArea() == getArea()) {
			return 0;
		}else {
			return -1;
		}
	}
}
