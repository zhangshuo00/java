package com.runoob.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Glossary glossary = new Glossary();
		glossary.setNewWordsNum(3);
		
		NewWords n1 = new NewWords();
		n1.setWords("pixel");
		n1.setTranslation("像素");
		glossary.addNewWords(n1);
		
		NewWords n2 = new NewWords();
		n2.setWords("decimal");
		n2.setTranslation("进制");
		glossary.addNewWords(n2);
		
		NewWords n3 = new NewWords();
		n3.setWords("operator");
		n3.setTranslation("操作符");
		glossary.addNewWords(n3);
		
		//修改某个英文对应的翻译
		glossary.modifyTranslationByWords("pixel", "香酥");
		
		//根据给定的英文单词，查找对应的翻译
		glossary.searchTranslationByWords("pixel");
		
		//遍历生词本
		System.out.println(glossary.toString());
	}

}
