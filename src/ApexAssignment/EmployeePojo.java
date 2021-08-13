package ApexAssignment;

import java.util.ArrayList;

public class EmployeePojo {
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public ArrayList<String> getDesignation() {
		return designation;
	}

	public void setDesignation(ArrayList<String> designation) {
		this.designation = designation;

	}

	public int getExperienceinYears() {
		return experienceinYears;
	}

	public void setExperienceinYears(int experienceinYears) {
		this.experienceinYears = experienceinYears;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public double getBonous() {
		return bonous;
	}

	public void setBonous(int bonous) {
		this.bonous = bonous;
	}

	private int empNo;
	private String empName;
	private String address;
	private String State;
	private int zipCode;
	private int phone;
	private ArrayList<String> designation;
	private int experienceinYears;
	private String emailAddress;
	private double basic;
	private double hra;
	private double bonous;

	public void BasicSalary(double MonthlySalary) {
		String Month = "12";
		int HoursWorked = 9;
		int PerHourRate = 45;
		double TaxRate = 0.10;
		System.out.println(MonthlySalary = (HoursWorked * PerHourRate) / 0.10);
		System.out.println(hra = (MonthlySalary * 20) / 100);
		System.out.println(bonous = (MonthlySalary % 40) / 100);

	}

	public void display() {
		System.out.println("empNo : " + this.empNo);
		System.out.println("empName : " + this.empName);
		System.out.println("address : " + this.address);
		System.out.println("State : " + this.State);
		System.out.println("zipCode : " + this.zipCode);
		System.out.println("phone : " + this.phone);
		System.out.println("experienceinYears: " + this.experienceinYears);
		System.out.println("emailAddress : " + this.emailAddress);
		System.out.println("basic : " + this.basic);
		System.out.println("hra: " + this.hra);
		System.out.println(" bonous: " + this.bonous);

	}

	public void getEmpName(String empName) {
		System.out.println("Emp Name = " + empName);

	}

	public void getAddress(String getAddress) {
		System.out.println(getAddress);

	}
}