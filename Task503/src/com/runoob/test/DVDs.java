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
	
	//����DVD��Ϣ
	public void addDVDs(DVDs dvds) {
		for(int i = 0;i<dvdsArray.length;i++) {
			if(dvdsArray[i] == null) {
				dvdsArray[i] = dvds;
				break;
			}
		}
	}
	
	//������Ϣ
	public void searchInformationByDVDName(String name) {
		for(int i = 0;i<dvdsArray.length;i++) {
			DVDs d = dvdsArray[i];
			String dName = d.getName();
			if(dName.contains(name)) {
				System.out.println(d.toString1());
			}
		}
	}
	
	//�����Ϣ
	public String toString() {
		return "DVD��:"+ name+" DVD���:"+number+" �۸�:"+price+" ������:"+publishingHouse+" ISRC��:"+isrc;
	}
	public String toString1() {
		String str = "DVD��Ϣ";
		for(int i = 0;i<dvdsArray.length;i++) {
			DVDs d = dvdsArray[i];
			str += d.toString();
		}
		return str;
	}
}
