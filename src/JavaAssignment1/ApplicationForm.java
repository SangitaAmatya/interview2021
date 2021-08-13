package JavaAssignment1;

public class ApplicationForm {
	// static
	static String companyName = "Google"; // static
	// non-static (or) instance
	private String firstName, lastName;
	private int year;

	public ApplicationForm() {
	}

	public ApplicationForm(String firstName, String lastName, int year) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.year = year;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	// non-static (or) instance
	public int getAge() {
		int CURRENT_YEAR = 2019; // Local variable
		return (CURRENT_YEAR - this.year);
	}

	public static void echo() {
		System.out.println("Static method");
		System.out.println("Static content - company name : " + ApplicationForm.companyName);
	}

	public void display() {
		System.out.println("First name : " + this.firstName);
		System.out.println("Last name : " + this.lastName);
		System.out.println("Year : " + this.year);
		System.out.println("Age : " + getAge());
	}
}
