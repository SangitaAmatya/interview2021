package inheritance;

public class Student extends person {

	private String college;

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	private String year;

	public String ToString() {
		return college + year;

	}
}