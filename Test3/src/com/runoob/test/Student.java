package com.runoob.test;

public class Student {
	private String number;
	private String name;
	private double englishScore;
	private double mathScore;
	private double sportsScore;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(double englishScore) {
		this.englishScore = englishScore;
	}

	public double getMathScore() {
		return mathScore;
	}

	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}

	public double getSportsScore() {
		return sportsScore;
	}

	public void setSportsScore(double sportsScore) {
		this.sportsScore = sportsScore;
	}

	@Override
	public String toString() {
		return "Student [number=" + number + ", name=" + name + ", englishScore=" + englishScore + ", mathScore=" + mathScore + ", sportsScore=" + sportsScore + "]";
	}
}