public class Equation {
	private double a, b, c, discriminant;
	private double root1, root2;

	// Create a constructor
	public Equation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		// Calculate the discriminant
		this.discriminant = (b*b) - (4*a*c);
	}

	// Create a method to calculate the roots of quadratic equation
	public void calculateRoot() {
		if (this.discriminant > 0) {
			root1 = (-b + Math.sqrt(discriminant)) / (2*a);
			root1 = (-b - Math.sqrt(discriminant)) / (2*a);
			System.out.println("The equation have two solutions:\nx1 = " + root1 + "\nx2 = " + root2 + "\n");
		}
		else if (this.discriminant == 0) {
			root1 = (-b + Math.sqrt(discriminant)) / (2*a);
			System.out.println("The equation have only one solution:\nx1 = " + root1 + "\n");
		}
		else {
			System.out.println("The equation have no solution");
		}
	}
}