package com.runoob.test;

public class Books extends Commodity {
	
	protected String author;
	protected String publicationDate;
	protected String isbn;
	protected Books[] booksArray;
	public Books(String name,String number,String price,String publishingHouse,String author,String publicationDate,String isbn) {
		super(name,number,price,publishingHouse);
		this.author = author;
		this.publicationDate = publicationDate;
		this.isbn = isbn;
	}
	public Books() {}
	//
	public void setBooksNum(int num) {
		booksArray = new Books[num];
	}
	public int getBooksNum() {
		return booksArray.length;
	}
	
	//
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//
	public String getPublicationDate() {
		return publicationDate;
	}
	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}
	
	//
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	//�����鼮��Ϣ
	public void addBooks(Books books) {
		for(int i = 0;i<booksArray.length;i++) {
			if(booksArray[i] == null) {
				booksArray[i] = books;
				break;
			}
		}
	}
	//����鼮��Ϣ
	public String toString() {
		return "����"+name+"���"+number+"�۸�"+price+"������"+publishingHouse+"����"+author+"��������"+publicationDate+"ISBN��"+isbn;
	}
	public String toString1() {
		String str = "�鼮��Ϣ :";
		
		for(int i = 0; i<booksArray.length ;i++) {
			if(booksArray[i] == null) {
				Books b = booksArray[i];
				str += b.toString();
			}
		}
		return str;
	}
	//��Ϣ����
	public void searchInformationByName(String name) {
		for(int i = 0;i<booksArray.length;i++) {
			Books b =booksArray[i];
			String bName = b.getName();
			if(bName.contains(name)) {
				System.out.println(b.toString1());
			}
		}
	}
}
