package com.runoob.test;

public class Glossary {
	private NewWords[] newWordsArray;
	
	public void setNewWordsNum(int num) {
		newWordsArray = new NewWords[num];
	}
	
	public int getNewWordsNum() {
		return newWordsArray.length;
	}
	//����
	public void addNewWords(NewWords newWords) {
		for(int i=0;i<newWordsArray.length;i++) {
			if(newWordsArray[i] == null) {
				newWordsArray[i] = newWords;
				break;
			}
		}
	}
	//�ַ�����ӡ
	public String toString() {
		String str = "Glossary : ";
		for(int i=0;i<newWordsArray.length;i++) {
			NewWords n = newWordsArray[i];
			
			str += n.toString();
		}
		return str;
	}
	//ͨ�����ʲ��ҷ���
	public void searchTranslationByWords(String words) {
		for(int i=0;i<newWordsArray.length;i++) {
			NewWords n = newWordsArray[i];
			String knownWord = n.getWords();
			if(knownWord.contains(words)) {
				System.out.println(n.toString());
			}
		}
	}
	//ͨ�������޸ķ���
	public void modifyTranslationByWords(String words,String translation) {
		for(int i=0;i<newWordsArray.length;i++) {
			if(newWordsArray[i].getWords().equals(words)) {
				newWordsArray[i].setTranslation(translation);
				break;
			}
		}
	}
}
