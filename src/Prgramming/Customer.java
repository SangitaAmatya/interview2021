package Prgramming;

public class Customer {

	private String Name;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = DOB;
	}

	public int getSSNNumber() {
		return SSNNumber;
	}

	public void setSSNNumber(int sSNNumber) {
		SSNNumber = sSNNumber;
	}

	private String Adress;
	private String DOB;
	private int SSNNumber;

	public Customer(String name, String Adress, String string) {

		this.Name = name;
		this.DOB = string;
		this.Adress = Adress;

	}

	public String toString() {
		return Adress + " " + Name + " " + DOB;

	}

}