package com.runoob.test;

import java.util.Scanner;
public class StudentMannagementSystem {
	private Student[] stu;
	private int aLength;
	private int length;
	
	
	public void setScore(int _id) {
		for(Student s:stu) {
			if(s.getID() == _id) {
				Scanner a=new Scanner(System.in);
				System.out.print("请输入英语成绩：");
				int _englishScore = a.nextInt();
				s.setEnglishScore(_englishScore);
				System.out.print("请输入高数成绩：");
				int _mathScore = a.nextInt();
				s.setMathScore(_mathScore);
				System.out.print("请输入体育成绩：");
				int _peScore = a.nextInt();
				s.setPEScore(_peScore);
			}
		}
	}
	public boolean setStu(int _id,String _name) {
		if(aLength==length) {
			return false;
		}else {
			stu[aLength].setAll(_id, _name, -1, -1, -1);
			aLength++;
			return true;
		}
	}
	public void getScoreThroughID(int _id) {
		for(Student s:stu) {
			if(s.getID()==_id) {
				s.getAll();
			}
		}
	}
	public void getAllInformation() {
		for(Student s:stu) {
			s.getAll();
		}
	}
	public void getScoreThroughName(String _name) {
		for(Student s:stu) {
			if(s.getName().contains(_name)==true) {
				s.getAll();
			}
		}
	}
}
