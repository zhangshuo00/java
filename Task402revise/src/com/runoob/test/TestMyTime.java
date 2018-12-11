package com.runoob.test;

public class TestMyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime time = new MyTime();
		System.out.println(time.getTime());
		
		//指定某一个小时，分钟和秒钟默认为0
		MyTime time1 = new MyTime(5);
		System.out.println(time1.getTime());
		
		//指定某一个小时和分钟，秒钟默认为0
		MyTime time2 = new MyTime(5,23);
		System.out.println(time2.getTime());
		
		//指定时间制，小时、分钟和秒钟默认为0
		MyTime time3 = new MyTime(true);
		System.out.println(time3.getTime());
		
		//默认12小时制时间
		time.setTime(3, 26, 47);
		System.out.println(time.getTime());
		// 设置12小时制时间
		time.setTimeSystem(true);
		System.out.println(time.getTime());
		// 设置24小时制时间
		time.setTimeSystem(false);
		System.out.println(time.getTime());
	}

}
