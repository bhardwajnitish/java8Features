package com.nitish.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();
		System.out.println("Length of string - " + f.apply("Nitish Bhardwaj"));

		//Function chaining

		Function<Integer, Integer> f1 = i -> i * 2;
		Function<Integer, Integer> f2 = i -> i * i * i;
		System.out.println("andThen - " + f1.andThen(f2).apply(2)); //first f1.apply then f2.apply
		System.out.println("compose - " + f1.compose(f2).apply(2)); //first f2.apply then f1.apply

		List<Student> students = Arrays.asList(new Student("nitish", 90), new Student("santosh", 62), new Student("rakesh", 51), new Student("mukesh", 45), new Student("suresh", 30));

		for (Student student : students) {
			ConsumerExample.printGrade(student);
		}
	}

	public static String calculateGrade(Student student) {
		Function<Student, String> f = s -> {
			if (s.getMarks() > 80) {
				return "A[Distinction]";
			} else if (s.getMarks() > 60) {
				return "B[First Class]";
			} else if (s.getMarks() > 50) {
				return "C[Second Class]";
			} else if (s.getMarks() > 40) {
				return "D[Third Class]";
			} else {
				return "E[Fail]";
			}
		};
		return f.apply(student);
	}
}
