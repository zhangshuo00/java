package com.runoob.test;

public class TestMyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime time = new MyTime();
		System.out.println(time.getTime());
		
		//ָ��ĳһ��Сʱ�����Ӻ�����Ĭ��Ϊ0
		MyTime time1 = new MyTime(5);
		System.out.println(time1.getTime());
		
		//ָ��ĳһ��Сʱ�ͷ��ӣ�����Ĭ��Ϊ0
		MyTime time2 = new MyTime(5,23);
		System.out.println(time2.getTime());
		
		//ָ��ʱ���ƣ�Сʱ�����Ӻ�����Ĭ��Ϊ0
		MyTime time3 = new MyTime(true);
		System.out.println(time3.getTime());
		
		//Ĭ��12Сʱ��ʱ��
		time.setTime(3, 26, 47);
		System.out.println(time.getTime());
		// ����12Сʱ��ʱ��
		time.setTimeSystem(true);
		System.out.println(time.getTime());
		// ����24Сʱ��ʱ��
		time.setTimeSystem(false);
		System.out.println(time.getTime());
	}

}
