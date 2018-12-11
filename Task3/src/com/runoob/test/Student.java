package com.runoob.test;

public class Student{
	
		private int id;
		private String name;
		private int englishScore;
		private int mathScore;
		private int peScore;
		
		//
		public void setID(int _id){
			id = _id;
		}
		public void setName(String _name){
			name = _name;
		}
		public void setEnglishScore(int _englishScore){
			englishScore = _englishScore;
		}
		public void setMathScore(int _mathScore){
			mathScore = _mathScore;
		}
		public void setPEScore(int _peScore){
			peScore = _peScore;
		}
		//
		public int getID(){
			return id;
		}
		public String getName(){
			return name;
		}
		public int getEnglishScore(){
			return englishScore;
		}
		public int getMathScore(){
			return mathScore;
		}
		public int getPEScore(){
			return peScore;
		}
		//
		public void getAll() {
			System.out.println(id+','+name+','+englishScore+','+mathScore+','+peScore);
		}
		public void setAll(int _id,String _name,int _englishScore,int _mathScore,int _peScore) {
			id = _id;
			name = _name;
			englishScore=_englishScore;
			mathScore=_mathScore;
			peScore=_peScore;
		}
}
