package com.runoob.test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Glossary glossary = new Glossary();
		glossary.setNewWordsNum(3);
		
		NewWords n1 = new NewWords();
		n1.setWords("pixel");
		n1.setTranslation("����");
		glossary.addNewWords(n1);
		
		NewWords n2 = new NewWords();
		n2.setWords("decimal");
		n2.setTranslation("����");
		glossary.addNewWords(n2);
		
		NewWords n3 = new NewWords();
		n3.setWords("operator");
		n3.setTranslation("������");
		glossary.addNewWords(n3);
		
		//�޸�ĳ��Ӣ�Ķ�Ӧ�ķ���
		glossary.modifyTranslationByWords("pixel", "����");
		
		//���ݸ�����Ӣ�ĵ��ʣ����Ҷ�Ӧ�ķ���
		glossary.searchTranslationByWords("pixel");
		
		//�������ʱ�
		System.out.println(glossary.toString());
	}

}
