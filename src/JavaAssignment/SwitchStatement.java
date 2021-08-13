package JavaAssignment;

public class SwitchStatement {

	public static void main(String[] args) {
		int Day = 8;

		switch (Day) {
		case 1:
			System.out.println("monday");
			break;

		case 2:
			System.out.println("Thuesday");
			break;
		case 3:
			System.out.println("wedensday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saterday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("There is no days avilable");
		}

	}
}
