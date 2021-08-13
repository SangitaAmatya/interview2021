package inheritance;

public class StudentRuuner {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("sangita");
		student.setEmail("sangetaamatya@gmail.com");
		student.setPhonenumber("1999245");
		student.setYear("2009");
		person person = new person();
		String value = person.toString();
		System.out.println(value);
		System.out.println(value.toString());

	}

}
