package com.runoob.test;

public class Commodity {
	protected String name;
	protected String number;
	protected String price;
	protected String publishingHouse;
	
	public Commodity(String name,String number,String price,String publishingHouse) {
		this.name = name;
		this.number = number;
		this.price = price;
		this.publishingHouse = publishingHouse;
	}
	public Commodity() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPublishingHouse() {
		return publishingHouse;
	}
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	
	
}
