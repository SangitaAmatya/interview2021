package JavaAssignment1;

public class RunApplicationForm {

	public static void main(String[] args) {
		ApplicationForm applicationForm1 = new ApplicationForm();
		applicationForm1.display();
		applicationForm1.setFirstName("sangita");
		System.out.println(applicationForm1.getFirstName());
		System.out.println(applicationForm1);

		ApplicationForm applicationForm2 = new ApplicationForm("abc", "xyz", 1990);
		applicationForm2.display();
		System.out.println(applicationForm2);

		System.out.println(ApplicationForm.companyName);
		ApplicationForm.echo();
	}
}
