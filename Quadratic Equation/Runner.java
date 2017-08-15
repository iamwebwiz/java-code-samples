public class Runner {
	public static void main(String[] args) {
		// supply some dummy values for variables a, b & c
		Equation eq1 = new Equation(8, -6, 1); // first equation
		Equation eq2 = new Equation(1, -4, 4); // second equation
		Equation eq3 = new Equation(1, 3, 8); // third equation

		// Calculate root for equation 1
		eq1.calculateRoot();
		// calculate root for equation 2
		eq2.calculateRoot();
		// calculate root for equation 3
		eq3.calculateRoot();
	}
}