package com.nitish.java8.example;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		// Used for Function when input and output is of same type

		Function<String, String> f = a -> a + " bhardwaj";
		System.out.println("Using Function - " + f.apply("nitish"));

		UnaryOperator<String> uo = a -> a + " bhardwaj";
		System.out.println("Using UnaryOperator - " + uo.apply("nitish"));

	}

}
