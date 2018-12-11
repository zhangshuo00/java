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
	//插入书籍信息
	public void addBooks(Books books) {
		for(int i = 0;i<booksArray.length;i++) {
			if(booksArray[i] == null) {
				booksArray[i] = books;
				break;
			}
		}
	}
	//输出书籍信息
	public String toString() {
		return "名称"+name+"编号"+number+"价格"+price+"出版社"+publishingHouse+"作者"+author+"出版日期"+publicationDate+"ISBN号"+isbn;
	}
	public String toString1() {
		String str = "书籍信息 :";
		
		for(int i = 0; i<booksArray.length ;i++) {
			if(booksArray[i] == null) {
				Books b = booksArray[i];
				str += b.toString();
			}
		}
		return str;
	}
	//信息查找
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
