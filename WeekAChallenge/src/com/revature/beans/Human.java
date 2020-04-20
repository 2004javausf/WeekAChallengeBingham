package com.revature.beans;

public class Human {
	private String name;
	private Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age.toString();
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public Human() {
		
	}
	public Human(String name) {
		this.name=name;
	}
	
	public String humanIntro() {
		return "Hi my name is "+this.getName()+", I'm " +this.getAge() + " years old.";
	}
	
}
