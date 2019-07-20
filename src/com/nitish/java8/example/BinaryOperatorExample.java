package com.nitish.java8.example;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {

		// Used for BiFunction when input and output is of same type

		BiFunction<String, String, String> bf = (a, b) -> a + " " + b;
		System.out.println("Using BiFunction - " + bf.apply("nitish", "bhardwaj"));

		BinaryOperator<String> bo = (a, b) -> a + " " + b;
		System.out.println(bo.apply("Using BinaryOperator - " + "nitish", "bhardwaj"));
	}

}
