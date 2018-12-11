package com.runoob.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//书籍信息操作
		Books books = new Books();
		books.setBooksNum(7);
		
		Books b1 = new Books();
		b1.setName("挪威的森林");
		b1.setNumber("001");
		b1.setPrice("$5");
		b1.setAuthor("村上春树");
		b1.setPublicationDate("2017.10.24");
		b1.setPublishingHouse("清华大学出版社");
		b1.setIsbn("123124");
		//保存书籍信息
		books.addBooks(b1);
		books.toString();
		//查找书籍信息
		//books.searchInformationByName("挪威的森林");
		
		
		//DVD信息操作
		DVDs dvds = new DVDs();
		dvds.setDVDsNum(5);
		
		DVDs d1 = new DVDs();
		d1.setName("电影合集");
		d1.setNumber("002");
		d1.setPrice("$10");
		d1.setPublishingHouse("xx影像社");
		d1.setIsrc("2017123456");
		//保存DVD信息
		dvds.addDVDs(d1);
		//查找DVD信息
		dvds.searchInformationByDVDName("电影合集");
		
	}

}
