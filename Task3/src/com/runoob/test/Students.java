package com.runoob.test;

public class Students{
	public static void main(String[] args){
		StudentMannagementSystem stu = new StudentMannagementSystem();

		stu.setStu(1, "����");
		stu.setStu(2, "������");
		stu.setStu(3, "����");
		stu.setStu(4, "����");
		stu.setStu(5, "���޼�");
		
		stu.setScore(1);
		stu.setScore(2);
		stu.setScore(3);
		stu.setScore(4);
		stu.setScore(5);
		
		stu.getScoreThroughID(2);
		
		stu.getScoreThroughName("��");
		
		stu.getAllInformation();

		
	}

}
