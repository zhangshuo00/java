package com.runoob.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentManagementSystem studentManagementSystem = new StudentManagementSystem();
		studentManagementSystem.setStudentNum(5);

		Student s0 = new Student();
		s0.setNumber("2017000001");
		s0.setName("zhangsan");
		s0.setEnglishScore(60);
		s0.setMathScore(89);
		s0.setSportsScore(70);
		studentManagementSystem.addStudent(s0);

		Student s1 = new Student();
		s1.setNumber("2017000002");
		s1.setName("lisi");
		s1.setEnglishScore(50);
		s1.setMathScore(35);
		s1.setSportsScore(34);
		studentManagementSystem.addStudent(s1);

		Student s2 = new Student();
		s2.setNumber("2017000003");
		s2.setName("wangwu");
		s2.setEnglishScore(56);
		s2.setMathScore(45);
		s2.setSportsScore(50);
		studentManagementSystem.addStudent(s2);

		Student s3 = new Student();
		s3.setNumber("2017000004");
		s3.setName("zhangliu");
		s3.setEnglishScore(66);
		s3.setMathScore(78);
		s3.setSportsScore(74);
		studentManagementSystem.addStudent(s3);

		Student s4 = new Student();
		s4.setNumber("2017000005");
		s4.setName("wangqi");
		s4.setEnglishScore(78);
		s4.setMathScore(92);
		s4.setSportsScore(55);
		studentManagementSystem.addStudent(s4);

		studentManagementSystem.searchStudentByName("zhangsan");
		studentManagementSystem.searchStudentByNum("2017000001");
		studentManagementSystem.changeStudentMathScoreByNum("2017000001", 100);
		studentManagementSystem.searchStudentByNum("2017000001");
		System.out.println(studentManagementSystem.toString());
	
		
	}

}
