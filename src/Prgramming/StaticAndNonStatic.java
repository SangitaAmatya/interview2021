package Prgramming;

public class StaticAndNonStatic {

	static String Name = "Sangita";
	String Adress = "2795 lavender ter, San jose";
	int SSNNumber = 12345;
	String Designation = "IT";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Name);// directSystem.out.println(Designatio
		StaticAndNonStatic ob = new StaticAndNonStatic();
		ob.Adress();
		ob.CollageFee();
		ob.SSNNumber();

	}

	private void SSNNumber() {
		// TODO Auto-generated method stub
		System.out.println("Student SsnNumber" + SSNNumber);
	}

	public void Adress() {
		System.out.println("Student Home Adress" + Adress);

	}

	public int CollageFee() {
		int YearlyFeeOfSchool = 1500;
		int MonthlyFee = 45;
		int PerdayFee;
		PerdayFee = YearlyFeeOfSchool * MonthlyFee / 360;
		System.out.println("PerDayFeeOfSchool " + PerdayFee);
		return MonthlyFee;
	}
}
