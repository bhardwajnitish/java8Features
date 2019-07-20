package com.nitish.java8.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		Functional_1 f = () -> {
			System.out.println("This is print method of Functional interface...");
		};

		f.print();
		Functional_1.printAgain();

		// we can remove argument type while calling functional interface method. compiler will get it autometically because
		// functional interface has only one method and hence it will find agrument type
		Functional_2 f2 = (a, b) -> a + b;
		int sum = f2.sum(5, 7);
		System.out.println("This is sum method of Function Interface Functional_2 - " + sum);
		sum = f2.sum(11, 28);
		System.out.println("This is sum method of Function Interface Functional_2 - " + sum);
		sum = f2.sum(89, 72);
		System.out.println("This is sum method of Function Interface Functional_2 - " + sum);

		// if a method has only one argument then we can remove small bracket '()'
		Functional_3 f3 = n -> n * n;
		System.out.println("This is squareIt method of Functional Interface Functional_3 = " + f3.squareIt(34));
		System.out.println("This is squareIt method of Functional Interface Functional_3 = " + f3.squareIt(4));
		System.out.println("This is squareIt method of Functional Interface Functional_3 = " + f3.squareIt(-5));

		//Example with  Runnable interface becuase Runnable interface is functional interface

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child thread");
			}
		};
		Thread t = new Thread(r);
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main thread");
		}

		//Example with Comparator Interface

		List<Integer> list = new ArrayList<>();
		list.add(20);
		list.add(12);
		list.add(89);
		list.add(2);
		list.add(-5);

		System.out.println("List without sorting - " + list);
		Comparator<Integer> c = (a, b) -> a > b ? 1 : (a < b) ? -1 : 0;
		Collections.sort(list, c);
		System.out.println("List after sortring - " + list);

	}

}

@FunctionalInterface
interface Functional {
	void print();
}

@FunctionalInterface
interface Functional_1 extends Functional {
	void print();

	public static void printAgain() {
		System.out.println("This is printAgain method of  Functional interface...");
	}
}

@FunctionalInterface
interface Functional_2 {
	int sum(int a, int b);
}

interface Functional_3 {
	int squareIt(int a);
}