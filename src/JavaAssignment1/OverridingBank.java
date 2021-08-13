package JavaAssignment1;

public class OverridingBank {
	double rateOfinterest() {
		return 0;

	}

}

class BOFA extends OverridingBank {
	double rateOfinterest() {
		return 6.5;

	}

	void displayInterestRate() {
		System.out.println("rateOfinterest");
	}

	class CITI extends OverridingBank {
		double rateOfinterest() {
			return 6.5;

		}
	}
}