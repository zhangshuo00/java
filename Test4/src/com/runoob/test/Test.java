package com.runoob.test;

public interface Test extends Trained,MyComparable{
	//增加了静态方法
	public static void funStatic() {
		System.out.println("接口中的静态方法");
	}
	public default void funDefault() {
		System.out.println("接口中的default方法");
	}
}
