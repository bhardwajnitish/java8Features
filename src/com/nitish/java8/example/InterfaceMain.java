package com.nitish.java8.example;

public interface InterfaceMain {

	// we can define main method inside iterface, because main method is static and it will called while calling java <interface>
	public static void main(String[] args) {
		System.out.println("This is static main method inside InterfaceMain...");
		display();

	}

	public static void display() {
		System.out.println("This is static display method inside InterfaceMain...");
	}

	default void show() {
		System.out.println("This is default show method inside InterfaceMain...");
	}
}
