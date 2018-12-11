package com.runoob.test;

public class NewWords {
	private String words;
	private String translation;
	public String getWords() {
		return words;
	}
	public void setWords(String words) {
		this.words = words;
	}
	public String getTranslation() {
		return translation;
	}
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	public String toString() {
		return " Words : " + words + " Translation : " + translation;
	}
}
