package com.nitish.java8.example;

public class ConstructorReferenceExample {

	public static void main(String[] args) {

		Interf_1 i1 = Sample::new;
		Sample s = i1.get();
		s.display();

		Interf_2 i2 = Sample::new;
		Sample s1 = i2.get("nitish");
		s1.display();

	}

}

interface Interf_1 {
	Sample get();
}

interface Interf_2 {
	Sample get(String s);
}

class Sample {

	public Sample() {
		System.out.println("Sample constructor executed....");
	}

	public Sample(String s) {
		System.out.println("Sample argument constructor executed.... " + s);
	}

	public void display() {
		System.out.println("Sample class display method is called...");
	}
}