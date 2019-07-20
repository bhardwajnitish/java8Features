package com.nitish.java8.example;

public class MethodReferenceExample {

	public static void main(String[] args) {

		MethodReferenceExample m = new MethodReferenceExample();
		Runnable r = m::m1;
		Thread t = new Thread(r);
		t.start();

		Runnable r1 = MethodReferenceExample::m2;
		Thread t1 = new Thread(r1);
		t1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread...");
		}

		Interf f = (a, b) -> {
			int add = a + b;
			System.out.println("add = " + add);
		};
		f.add(30, 20);

		f = m::sum;
		f.add(70, 20);

	}

	private void sum(int a, int b) {
		int sum = a + b;
		System.out.println("sum = " + sum);
	}

	private void m1() {
		// we can write below lines of code in seperate method and then call that method.
		// Arguments of method should match with run method. modifier and return type can be anything.

		/*
		 * Runnable r = () -> { for (int i = 0; i < 10; i++) {
		 * System.out.println("Child Thread..."); } };
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread m1...");
		}

	}

	private static void m2() {
		// we can write below lines of code in seperate method and then call that method.
		// Arguments of method should match with run method. modifier and return type can be anything.

		/*
		 * Runnable r = () -> { for (int i = 0; i < 10; i++) {
		 * System.out.println("Child Thread..."); } };
		 */
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread m2...");
		}

	}

}

interface Interf {
	void add(int a, int b);
}
