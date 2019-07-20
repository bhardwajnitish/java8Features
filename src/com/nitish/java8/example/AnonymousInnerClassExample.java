package com.nitish.java8.example;

public class AnonymousInnerClassExample {

	public static void main(String[] args) {

		Interface_1 i1 = new Interface_1() {

			@Override
			public void show() {
				System.out.println("This is show method");
			}

			@Override
			public void display() {
				System.out.println("This is display method");
			}
		};
		i1.show();
		i1.display();

		Interface_2 i2 = () -> System.out.println("This is showMore method ");
		i2.showMore();
	}

}

interface Interface_1 {

	void display();

	void show();
}

interface Interface_2 {
	void showMore();
}
