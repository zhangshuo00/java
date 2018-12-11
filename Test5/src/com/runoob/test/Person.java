package com.runoob.test;

public class Person {
	private String name;
	private int age;
	private String gender;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj instanceof Person) {
			Person anPerson  = (Person)obj;
			if(this.name.equals(anPerson.name) && 
					this.age == anPerson.age && 
					this.gender.equals(anPerson.gender)) {
				return true;
			}
				
		}
		return false;
	}
	
	public int hashCode() {
		int result = 1;
		result = 31*result+age;
		result = 31*result+name.hashCode();
		result = 31*result+gender.hashCode();
		return result;
	}
}
