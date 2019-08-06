package com.savnet.session04;

public class StudentClient {
	public static void main(String[] args) {
		Student student1 = new Student("Ghita", "123412341324", 25, 170, 10);
//		student1.name = "Ghita";
//		student1.cnp = "123412341324";
//		student1.age = 25;
//		student1.height = 170;
//		student1.grade = 10;

		student1.show();

		Student student2 = new Student("Mircea", "3433341234", 22, 140, 9);

//		student2.name = "Mircea";
//		student2.cnp = "3433341234";
//		student2.age = 22;
//		student2.height = 140;
//		student2.grade = 9;

		student2.show();

//		System.out.println(student1.name + " " + student1.grade);
//		System.out.println(student2.name + " " + student2.grade);

//		System.out.println(student1.getName() + " " + student1.getGrade());
//		System.out.println(student2.getName() + " " + student2.getGrade());

		System.out.println(student1.getStatus());
		System.out.println(student2.getStatus());
		System.out.println(student1.getStatus('-'));
		System.out.println(student2.getStatus('*'));

//		student1 = student2;
//		student2.grade = 4;
//		student1.show();

	}
}
