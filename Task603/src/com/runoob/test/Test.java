package com.runoob.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graphics gr[] = new Graphics[3];
		gr[0] = new Circle("green",true,3.0);
		gr[1] = new Square("yellow",false,4.0);
		gr[2] = new Rectangle("red",false,10.0,5.0);
		
		System.out.println(gr[0].toString());
		System.out.println("圆的面积："+gr[0].getArea());
		System.out.println("圆的周长："+gr[0].getPerimeter());
		
		System.out.println(gr[1].toString());
		System.out.println("正方形的面积："+gr[1].getArea());
		System.out.println("正方形的周长："+gr[1].getPerimeter());
		
		System.out.println(gr[2].toString());
		System.out.println("长方形的面积："+gr[2].getArea());
		System.out.println("长方形的周长："+gr[2].getPerimeter());
		
		double max = 0;
		for(int i = 0;i<gr.length-1;i++) {
			if(gr[i].comparableTo(gr[i+1]) == 1 && gr[i+1].getArea()>max) {
				max = gr[i+1].getArea();
			}else if(gr[i].comparableTo(gr[i+1]) == -1 && gr[i+1].getArea()>max) {
				max = gr[i].getArea();
			}else {
				break;
			}
		}
		System.out.println(max);
	}

}
