package com.runoob.test;

public class Glossary {
	private NewWords[] newWordsArray;
	
	public void setNewWordsNum(int num) {
		newWordsArray = new NewWords[num];
	}
	
	public int getNewWordsNum() {
		return newWordsArray.length;
	}
	//插入
	public void addNewWords(NewWords newWords) {
		for(int i=0;i<newWordsArray.length;i++) {
			if(newWordsArray[i] == null) {
				newWordsArray[i] = newWords;
				break;
			}
		}
	}
	//字符串打印
	public String toString() {
		String str = "Glossary : ";
		for(int i=0;i<newWordsArray.length;i++) {
			NewWords n = newWordsArray[i];
			
			str += n.toString();
		}
		return str;
	}
	//通过单词查找翻译
	public void searchTranslationByWords(String words) {
		for(int i=0;i<newWordsArray.length;i++) {
			NewWords n = newWordsArray[i];
			String knownWord = n.getWords();
			if(knownWord.contains(words)) {
				System.out.println(n.toString());
			}
		}
	}
	//通过单词修改翻译
	public void modifyTranslationByWords(String words,String translation) {
		for(int i=0;i<newWordsArray.length;i++) {
			if(newWordsArray[i].getWords().equals(words)) {
				newWordsArray[i].setTranslation(translation);
				break;
			}
		}
	}
}
