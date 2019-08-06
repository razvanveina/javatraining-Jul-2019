package com.savnet.session04;

public class Student {
	private String name;
	private int height;
	private int age;
	private String cnp;
	private int grade;

	public Student(String name, String cnp, int age, int height, int grade) {
		this.name = name;
		this.cnp = cnp;
		this.age = age;
		this.height = height;
		this.grade = grade;
	}

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public void show() {
		System.out.println(name + " " + cnp + " " + age + " " + height + " " + grade);
	}

	private String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public String getStatus() {
		return getName() + " " + grade + " " + height;
	}

	public String getStatus(char ch) {
		return getName() + ch + grade + ch + height;
	}

}
