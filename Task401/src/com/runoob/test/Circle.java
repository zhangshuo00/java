package com.runoob.test;

public class Circle {
	private double radius;//����ʵ��ϸ�ڣ���֤���ݵİ�ȫ��
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double r) {
		radius = r;
	}
	public double caculatePerimete() {//���ܳ�
		return 3.14*2*radius;
	}
	public double caculateArea() {//�����
		
		return 3.14*radius*radius;
	}
	public String toString() {//�����ַ���
		double per = caculatePerimete();
		double area = caculateArea();
		return "radius="+radius+" perimete="+per+" area="+area;
	}
}