package com.savnet.session04;

public class StudentClient2 {
	public static void main(String[] args) {
		Student[] students = { //
				new Student("Ion", 10), //
				new Student("Ghita", 8), //
				new Student("Mircea", 7), //
				new Student("Ana", 10),
				//
		};

		System.out.println(studentsAvg(students));

	}

	private static double studentsAvg(Student[] students) {
		double sum = 0;
		for (Student student : students) {
			sum += student.getGrade();
		}
		return sum / students.length;
	}

}
