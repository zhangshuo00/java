package com.baidu.file;//����

import java.io.BufferedReader;//����io���µģ���ȡ�ı��ļ�
import java.io.File;//����io���µ�file��
import java.io.FileReader;//�����ȡ�ַ�������
import java.io.FileWriter;//��������ֽ������ݵĶ�ȡ��д�����
import java.io.IOException;//
import java.io.Writer;//д���ַ���

public class Demo{
	  public static void main(String[] args){
		  try{//Ϊ�˱�֤������ȶ�����
			  FileReader fileReader = new FileReader("E:\\original.txt");//����FileReader���������ļ�
			  BufferedReader bufferedReader = new BufferedReader(fileReader);//����BufferedReader�����ṩ�ı��Ķ�ȡ
			  Writer writer = new FileWriter(new File("E:\\modified.txt"));
			  String str;//�����ַ�����
				while ((str = bufferedReader.readLine()) != null) {//ͨ��whileѭ���ļ���ÿһ��
					writer.write(str + "2017012067"+"��˷"+"\r\n");//д���ַ�����Ϣ
				}
				bufferedReader.close();//�ڶ�ȡ�������Ĺ����г��������������������ȡ������Щ���ݷŻ�����Դ�������Զ�ȡ�����иı�
				fileReader.close();//�ر��ļ��Ķ�ȡ
				writer.close();//�ر��ļ���д��
			} catch (IOException e) {//��try����г����쳣ʱ��
				//��ִ��catch�е���䣬java����ʱϵͳ���Զ���catch�����е�IOException e ��ʼ��
				e.printStackTrace();//�������д�ӡ�쳣��Ϣ�ڳ����г����λ�ü�ԭ��
		  }
	  }
  }
