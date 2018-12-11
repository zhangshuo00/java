package com.runoob.test;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	// timeSystem表示时间制，false代表24小时制，true代表12小时制
	
	private boolean timeSystem = false;
	//默认的时间为06:06:06 AM，默认是12小时制
	public MyTime() {
		this.hour = 6;
		this.minute = 6;
		this.second = 6;
		this.timeSystem = true;
	}
	//指定某一个小时，分钟和秒钟默认为0
	public MyTime(int hour) {
		this.hour = hour;
		this.minute = 0;
		this.second = 0;
		//this.timeSystem = false;
	}
	//指定某一个小时和分钟，秒钟默认为0
	public MyTime(int hour,int minute) {
		this.hour = hour;
		this.minute = minute;
		this.second = 0;
		//this.timeSystem = false;
	}
	//指定时间制，小时、分钟和秒钟默认为0
	public MyTime(boolean timeSystem) {
		this.timeSystem = timeSystem;
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
		
	}
	
	
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		if (hour < 24) {
			this.hour = hour;
		} else {
			this.hour = hour % 24;
		}
	}
	//
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		if (minute < 60) {
			this.minute = minute;
		} else {
			int hours = minute / 60;
			setHour(getHour() + hours);
			this.minute = minute % 60;
		}
	}
	//
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		if (second < 60) {
			this.second = second;
		} else {
			int minutes = second / 60;
			setMinute(getMinute() + minutes);
			this.second = second % 60;
		}
	}

	public void setTime(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public void setTimeSystem(boolean timeSystem) {
		this.timeSystem = timeSystem;
	}

	public boolean getTimeSystem() {
		return timeSystem;
	}

	public String getTime() {
		String msg = "";
		if (!timeSystem) {
			msg += getTime24(hour);
		}
		if (timeSystem) {
			msg += getTime12();
		}
		return msg;
	}

	private String getTime12() {
		String msg = "";
		if (hour < 12) {
			msg += getTime24(hour);
			msg += " AM";
		} else {
			int ahour = hour % 12;
			msg += getTime24(ahour);
			msg += " PM";
		}
		return msg;
	}

	private String getTime24(int hour) {
		String msg = "";

		if (hour < 10) {
			msg += "0" + hour;
		} else {
			msg += hour;
		}
		if (minute < 10) {
			msg += ":" + "0" + minute;
		} else {
			msg += ":" + minute;
		}
		if (second < 10) {
			msg += ":" + "0" + second;
		} else {
			msg += ":" + second;
		}
		return msg;
	}
}
