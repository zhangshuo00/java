package com.runoob.test;

public interface Test extends Trained,MyComparable{
	//�����˾�̬����
	public static void funStatic() {
		System.out.println("�ӿ��еľ�̬����");
	}
	public default void funDefault() {
		System.out.println("�ӿ��е�default����");
	}
}
