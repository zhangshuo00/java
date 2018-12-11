package com.runoob.test;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	private String defaultTime;
	private boolean decimal;
	//
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public boolean getDecimal() {
		return decimal;
	}
	//
	public void setHour(int h) {
		hour = h;
	}
	public void setMinute(int m) {
		minute = m;
	}
	public void setSecond(int s) {
		second = s;
	}
	public void setDecimal(boolean d) {
		decimal = d;
	}
	//
	boolean twelve = true;
	boolean twentyFour = false;
	//
	public String toString(int a,int b,int c,boolean d) {
		if(d) {//12进制
			if(a>12) {
				int a1 = a-12;
				System.out.print(a1<10?"0"+a1:a1);
				System.out.print(":");
				System.out.print(b<10?"0"+b:b);
				System.out.print(":");
				System.out.print(c<10?"0"+c:c);
				System.out.print(" PM");
			}else {
				System.out.print(a<10?"0"+a:a);
				System.out.print(":");
				System.out.print(b<10?"0"+b:b);
				System.out.print(":");
				System.out.print(c<10?"0"+c:c);
				System.out.print(" AM");
			}
		}else {//24进制
			System.out.print(a<10?"0"+a:a);
			System.out.print(":");
			System.out.print(b<10?"0"+b:b);
			System.out.print(":");
			System.out.print(c<10?"0"+c:c);
		}
		return "";
	}
}
