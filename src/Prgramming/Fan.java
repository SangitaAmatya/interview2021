package Prgramming;

public class Fan {

	private String make;
	private String color;
	private double radius;
	private boolean IsOn;
	private byte speed;

	public Fan(String make, String color, double radius, boolean IsOn, byte speed) {
		this.make = make;
		this.radius = radius;
		this.color = color;
		this.IsOn = IsOn;
		this.speed = speed;

	}

	public Fan(String string, double d, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return String.format(make);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan fanrunner = new Fan("Manufacture1", 1.45, "black");
		System.out.println(fanrunner);
	}

}
