package com.nitish.java8.example;

public class Test extends Exception {

	private void test() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (Exception e) {
			throw new NullPointerException();
		} finally {
			throw new RuntimeException();
		}
	}

	public static void main(String[] args) {
		new Test().test();
		try {
			throw new Test();
		} catch (Test e) {
			System.out.println("catch ");
			e.printStackTrace();
		} finally {
			System.out.println("finally ");
		}
	}
}
