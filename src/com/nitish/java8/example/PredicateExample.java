package com.nitish.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		Predicate<Integer> p = num -> num % 2 == 0;
		System.out.println(p.test(10));
		System.out.println(p.test(15));
		System.out.println(p.test(-4));

		String[] arr = { "nitish", "pushpa", "nilesh", "subhash", "shailender", "prabhat", "arpit", "nishtha" };
		Predicate<String> p1 = str -> str.length() > 6;
		for (String str : arr) {
			if (p1.test(str)) {
				System.out.println(str);
			}
		}

		int[] arr1 = { 0, 5, 10, 15, 20, 25, 30, 35, 40 };
		Predicate<Integer> p2 = num -> num % 2 == 0;
		Predicate<Integer> p3 = num -> num > 10;
		System.out.println("Numbers which are even and > 10 are");
		for (int num : arr1) {
			if (p2.and(p3).test(num)) {
				System.out.println(num);
			}
		}

		System.out.println("Numbers which are even or > 10 are");
		for (int num : arr1) {
			if (p2.or(p3).test(num)) {
				System.out.println(num);
			}
		}

		System.out.println("Numbers which are not even are");
		for (int num : arr1) {
			if (p2.negate().test(num)) {
				System.out.println(num);
			}
		}

		System.out.println("Numbers which are < 10 are");
		for (int num : arr1) {
			if (p3.negate().test(num)) {
				System.out.println(num);
			}
		}
		List<Student> students = Arrays.asList(new Student("nitish", 90), new Student("santosh", 62), new Student("rakesh", 51), new Student("mukesh", 45), new Student("suresh", 30));

		for (Student student : students) {
			if (filterSudent(student, 50)) {
				ConsumerExample.printGrade(student);
			}
		}
	}

	public static boolean filterSudent(Student student, int marks) {
		Predicate<Student> p = s -> s.getMarks() > marks;
		return p.test(student);
	}

}
