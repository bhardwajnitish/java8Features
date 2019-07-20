package com.nitish.java8.example;

public class DefaultMethodExample {

	public static void main(String[] args) {

		Class_1 c1 = new Class_1();
		c1.print();
		c1.show();
		c1.display();

		Interface_4.showAgain();
		//Interface_4_4.showAgain() // not possible. Static method of any interface can be called by that interface only
		Interface_4_4.showAgain();
	}

}

interface Interface_4 {

	void print();

	void show();

	default void display() {
		System.out.println("Default display method of Interface_4");
	}

	static void showAgain() {
		System.out.println("This is static showAgain method of Interface_4 interface...");
	}

}

interface Interface_4_4 extends Interface_4 {

	static void showAgain() {
		System.out.println("This is static showAgain method of Interface_4_4 interface...");
	}
}

interface Interface_5 {
	default void display() {
		System.out.println("Default display method of Interface_5");
	}
}

class Class_1 implements Interface_4, Interface_5 {

	@Override
	public void print() {
		System.out.println("This is print abstract method of interface Interface_4");
	}

	@Override
	public void show() {
		System.out.println("This is show abstract method of interface Interface_4");
	}

	// if two interface has same method then while implementing both, implementing class has to override default method.
	@Override
	public void display() {
		System.out.println("overriding display method");
		Interface_4.super.display();
		Interface_5.super.display();
	}

}
