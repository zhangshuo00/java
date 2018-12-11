package com.runoob.test;


public class StudentManagementSystem {
	private Student[] studentArray;

	public void setStudentNum(int num) {
		studentArray = new Student[num];
	}

	public int getStudentNum() {
		return studentArray.length;
	}

	public void searchStudentByName(String name) {
		for (int i = 0; i < studentArray.length; i++) {
			Student s = studentArray[i];
			String sname = s.getName();
			if (sname.contains(name)) {
				System.out.println(s.toString());
			}
		}
	}

	public void searchStudentByNum(String num) {
		for (int i = 0; i < studentArray.length; i++) {
			Student s = studentArray[i];
			String sNum = s.getNumber();
			if (sNum.contains(num)) {
				System.out.println(s.toString());
			}
		}
	}

	@Override
	public String toString() {
		String str = "StudentManagementSystem [";
		for (int i = 0; i < studentArray.length; i++) {
			Student s = studentArray[i];
			str += s.toString();
		}
		str += "]";
		return str;
	}

	public void addStudent(Student student) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] == null) {
				studentArray[i] = student;
				break;
			}
		}
	}

	public void changeStudentMathScoreByNum(String num, double mathScore) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i].getNumber().equals(num)) {
				studentArray[i].setMathScore(mathScore);
				break;
			}
		}
	}
}