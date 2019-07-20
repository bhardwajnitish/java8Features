package com.nitish.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);
		c.accept("Nitish Bhardwaj");

		List<Student> students = Arrays.asList(new Student("nitish", 90), new Student("santosh", 62), new Student("rakesh", 51), new Student("mukesh", 45), new Student("suresh", 30));

		for (Student student : students) {
			printGrade(student);

		}
	}

	public static void printGrade(Student student) {
		Consumer<Student> c = s -> {
			String grade = FunctionExample.calculateGrade(student);
			System.out.println("Studnt name - " + student.getName() + " , Student marks - " + student.getMarks() + " , Student grade - " + grade);
		};
		c.accept(student);
	}

}
