package com.runoob.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�鼮��Ϣ����
		Books books = new Books();
		books.setBooksNum(7);
		
		Books b1 = new Books();
		b1.setName("Ų����ɭ��");
		b1.setNumber("001");
		b1.setPrice("$5");
		b1.setAuthor("���ϴ���");
		b1.setPublicationDate("2017.10.24");
		b1.setPublishingHouse("�廪��ѧ������");
		b1.setIsbn("123124");
		//�����鼮��Ϣ
		books.addBooks(b1);
		books.toString();
		//�����鼮��Ϣ
		//books.searchInformationByName("Ų����ɭ��");
		
		
		//DVD��Ϣ����
		DVDs dvds = new DVDs();
		dvds.setDVDsNum(5);
		
		DVDs d1 = new DVDs();
		d1.setName("��Ӱ�ϼ�");
		d1.setNumber("002");
		d1.setPrice("$10");
		d1.setPublishingHouse("xxӰ����");
		d1.setIsrc("2017123456");
		//����DVD��Ϣ
		dvds.addDVDs(d1);
		//����DVD��Ϣ
		dvds.searchInformationByDVDName("��Ӱ�ϼ�");
		
	}

}
