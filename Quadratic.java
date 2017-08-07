import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		double root1, root2, d;
		System.out.print("Enter value for a: ");
		a = sc.nextInt();
		System.out.print("Enter value for b: ");
		b = sc.nextInt();
		System.out.print("Enter value for c: ");
		c = sc.nextInt();

		d = b*b - 4*a*c;

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
}