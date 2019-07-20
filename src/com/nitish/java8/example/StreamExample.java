package com.nitish.java8.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("nitish", "santosh", "nilesh", "mukesh", "rakesh", "suresh");

		//filter
		System.out.println("filter...............");
		names.stream().filter(StreamExample::isNotSame).forEach(System.out::println); //using method reference
		names.stream().filter(StreamExample::isNotSameAgain).forEach(System.out::println); //using predicate
		names.stream().filter(x -> !x.equals("rekesh")).forEach(System.out::println); //using lambda

		//map
		System.out.println("map............");
		Stream<Object> studentStream = names.stream().map(Student::new);
		//studentStream.forEach(student -> System.out.println(student));
		List<Object> studentList = studentStream.collect(Collectors.toList()); // will throw  java.lang.IllegalStateException: stream has already been operated upon or closed
		studentList.forEach(System.out::println);

		//mapToInt
		List<Student> studentList1 = names.stream().map(Student::new).collect(Collectors.toList());
		int sumOfMarks = studentList1.stream().mapToInt(Student::getMarks).sum();
		System.out.println("sum of marks - " + sumOfMarks);

	}

	private static boolean isNotSame(String name) {
		return !name.equals("rakesh");
	}

	private static boolean isNotSameAgain(String name) {
		Predicate<String> p = n -> !name.equals("rakesh");
		return p.test(name);
	}

}
