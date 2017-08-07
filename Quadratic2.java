public class Quadratic2 {

	public static int a, b, c;
	public static double root1, root2, d;

	public static void setValues(int a, int b, int c) {
		a = a;
		b = b;
		c = c;
	}

	public static void calculateRoot() {
		d = b*b - (4*a*c);
		if (d>0) {
			root1 = (-b + Math.sqrt(d))/(2*a);
			root2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("First root is: " + root1);
			System.out.println("Second root is: " + root2);
		}
		else if (d==0) {
			System.out.println("Roots are real and equal");
			root1 = (-b + Math.sqrt(d))/(2*a);
			System.out.println("Root is: " + root1);
		}
		else {
			root1 = (-b + Math.sqrt(d))/(2*a);
			root2 = (-b - Math.sqrt(d))/(2*a);
			System.out.println("Roots are imaginary");
		}
	}

	public static void main(String[] args) {
		setValues(4, 20, 5);
		calculateRoot();
	}
}