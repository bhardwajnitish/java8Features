package com.nitish.java8.example;

public class Student {

	private String name;
	private int marks = 76;

	public Student() {

	}

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public String getName() {
		return this.name;
	}

	public int getMarks() {
		return this.marks;
	}

	@Override
	public String toString() {
		return "Student [name=" + this.name + ", marks=" + this.marks + "]";
	}

}
