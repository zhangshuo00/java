package com.runoob.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class Demo {

	public static void main(String[] args) throws ParseException {
		
//		String s1 = "abc-def-gh";
//		String s2 = "abc";
//		String s3 = new String("abc");
//		String s4 = new String("abc");
//		System.out.println(s1 == s2);//true
//		System.out.println(s3 == s4);//false
//		System.out.println(s1 == s3);//false
//		s1 = s1 + "def";
//		String[] res = s1.split("-");
//		for(String s:res) {
//			System.out.println(s);
//		}
//		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.get(Calendar.HOUR));
//		System.out.println(cal.get(Calendar.MONTH)+1);
//		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
//		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//һ�ܵĵڼ���
//		
//		Calendar cal1 = Calendar.getInstance();
//		cal1.set(Calendar.YEAR, 2008);
//		cal1.set(Calendar.MONTH, 7);
//		cal1.set(Calendar.DATE, 8);
//		
//		//Calender �� DATE ��ת��
//		Calendar cal2 = Calendar.getInstance();
//		Date date = cal2.getTime();
//		System.out.println(date.toString());
//		
//		Date date1 = new Date(60*1000);
//		Calendar cal3 = Calendar.getInstance();
//		cal3.setTime(date1);
//		System.out.println(cal3.toString());
		
		//���ڵĸ�ʽ��
		//������ת���ַ�������
//		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
//		Date date = new Date();
//		String dateStr = df.format(date);
//		System.out.println(dateStr);//2018��12��7��
//		//
//		SimpleDateFormat adf = new SimpleDateFormat("yyyy��MM��dd�� hh:mm");
//		Date date1 = new Date();
//		String now = adf.format(date1);
//		System.out.println(now);
//		
		
		//���ַ���ת������
//		String dateStr1 = "2008-08-08";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		try {
//			Date date2 = sdf.parse(dateStr1);
//			System.out.println(date2.toString());
//		}catch(ParseException e){
//			e.printStackTrace();
//		}
		
		
		//JDK8�е���������
//		Instant now = Instant.now();
//		Instant now1 = Instant.ofEpochSecond(60*60);
//		//Instant first = now.with(TemporalAdjusters.next(dayOfWeek,FRIDAY));
//		
//		LocalDateTime ldt = LocalDateTime.of(2008, 8,8,8,8);
//		LocalDate dd = ldt.toLocalDate();
		
		
//		List<String> list1 = new ArrayList<String>();
//		//List<Integer> list = new ArrayList<Integer>();
//		//list.add(10);
//		list1.add("NewYork");
//		list1.add("London");
//		list1.add("BeiJing");
//		
////		list1.remove("London");
////		list1.remove(0);
//		
//		System.out.println(list1.toString());
//		System.out.println(list1.get(1));
//		
//		//����List
//		for(int i = 0;i<list1.size();i++) {
//			System.out.println(list1.get(i));
//		}
//		for(String s : list1) {
//			System.out.println(s);
//		}
//		
//		//������
//		Iterator<String> it = list1.iterator();
//		while(it.hasNext()) {
//			String str = it.next();
//			System.out.println(str);
//		}
//		
//		LinkedList<String> list2 = new LinkedList<String>();
		
//		Set<String> set = new HashSet<String>();
//		set.add("NewYork");
//		set.add("London");
//		set.add("ShiJiazhuang");
//		System.out.println(set);
		
		//Set<Book> bookSet = new HashSet<Book>();
		//Book book1 = new Book("001",
		
		Scanner s = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd��");
		
		System.out.println("������ - �� - �յĸ�ʽ����������գ�");
		String birthday = s.nextLine();
		
		Date birth = sdf1.parse(birthday);
		birthday = sdf2.format(birth);
		System.out.println(birthday);
		//
		
		String date = sdf1.format(cal.getTime());
		String nextBirth = "2019-10-29";
		Date today = sdf1.parse(date);
		Date nextBirthday = sdf1.parse(nextBirth);
		long intervalDay = (nextBirthday.getTime() - today.getTime())/(24*60*60*1000);
		System.out.println("�����������ջ���" + intervalDay + "��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
	}

}
