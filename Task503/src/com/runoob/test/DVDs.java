package com.runoob.test;

public class DVDs extends Commodity {
	
	protected String isrc;
	protected DVDs[] dvdsArray;
	public DVDs(String name, String number, String price, String publishingHouse,String isrc) {
		super(name, number, price, publishingHouse);
		// TODO Auto-generated constructor stub
		this.isrc = isrc;
	}
	public DVDs() {}
	//
	public void setDVDsNum(int num) {
		dvdsArray = new DVDs[num];
	}
	public int getDVDsnum() {
		return dvdsArray.length;
	}
	//
	public String getIsrc() {
		return isrc;
	}
	public void setIsrc(String isrc) {
		this.isrc = isrc;
	}
	
	//插入DVD信息
	public void addDVDs(DVDs dvds) {
		for(int i = 0;i<dvdsArray.length;i++) {
			if(dvdsArray[i] == null) {
				dvdsArray[i] = dvds;
				break;
			}
		}
	}
	
	//查找信息
	public void searchInformationByDVDName(String name) {
		for(int i = 0;i<dvdsArray.length;i++) {
			DVDs d = dvdsArray[i];
			String dName = d.getName();
			if(dName.contains(name)) {
				System.out.println(d.toString1());
			}
		}
	}
	
	//输出信息
	public String toString() {
		return "DVD名:"+ name+" DVD编号:"+number+" 价格:"+price+" 出版社:"+publishingHouse+" ISRC号:"+isrc;
	}
	public String toString1() {
		String str = "DVD信息";
		for(int i = 0;i<dvdsArray.length;i++) {
			DVDs d = dvdsArray[i];
			str += d.toString();
		}
		return str;
	}
}
