package com.baidu.file;//包名

import java.io.BufferedReader;//引入io包下的，读取文本文件
import java.io.File;//引入io包下的file类
import java.io.FileReader;//引入读取字符流的类
import java.io.FileWriter;//引入基于字节流数据的读取或写入的类
import java.io.IOException;//
import java.io.Writer;//写入字符流

public class Demo{
	  public static void main(String[] args){
		  try{//为了保证程序的稳定运行
			  FileReader fileReader = new FileReader("E:\\original.txt");//创建FileReader对象，引入文件
			  BufferedReader bufferedReader = new BufferedReader(fileReader);//创建BufferedReader对象，提供文本的读取
			  Writer writer = new FileWriter(new File("E:\\modified.txt"));
			  String str;//创建字符类型
				while ((str = bufferedReader.readLine()) != null) {//通过while循环文件的每一行
					writer.write(str + "2017012067"+"张朔"+"\r\n");//写入字符串信息
				}
				bufferedReader.close();//在读取数据流的过程中出现意外情况，来不及读取，把那些数据放回数据源，而不对读取方进行改变
				fileReader.close();//关闭文件的读取
				writer.close();//关闭文件的写入
			} catch (IOException e) {//当try语句中出现异常时，
				//会执行catch中的语句，java运行时系统会自动将catch括号中的IOException e 初始化
				e.printStackTrace();//在命令行打印异常信息在程序中出错的位置及原因
		  }
	  }
  }
