package com.runoob.test;

public class DemoMonday {
	public int max(int x,int y) {//ͨ���βε���������
		if(x > y)
			return x;
		return y;
	}
	
	public int max(int x,int y,int z) {
		return max(max(x,y),z);
	}
	
	public float max(float x,float y) {
		if(x > y)
			return x;
		return y;
	}
}
