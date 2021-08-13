package JavaAssignment1;

public class SuperkeyConcept {

	String color = "white";

	void eating() {
		System.out.println("Eating........");
	}

	SuperkeyConcept() {
		System.out.println("Animal is created");
	}

}

class Dog extends SuperkeyConcept {
	String color = "Black";

	Dog() {
		super();// Invoked paraent class constructor
		System.out.println("Dog is created");

	}

	/*
	 * void displaycolor() { System.out.println(color);
	 * System.out.println(super.color); }
	 */

	/*
	 * void eating() { System.out.println("Eating Bread........"); super.eating(); }
	 */
}
