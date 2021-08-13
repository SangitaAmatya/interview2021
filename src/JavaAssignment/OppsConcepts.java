package JavaAssignment;

public class OppsConcepts {
	int empid;
	String Name;
	double salary;
	int age;

	void disaplay() {

		System.out.println(empid);
		System.out.println(Name);
		System.out.println(salary);
		System.out.println(age);

	}

	public static void main(String[] args) {

		OppsConcepts Emp = new OppsConcepts();
		Emp.empid = 100;
		Emp.Name = "sangita";
		Emp.age = 30;
		Emp.salary = 2000.00;
	}
}