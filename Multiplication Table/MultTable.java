import java.util.Scanner;

public class MultTable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;
		System.out.print("Enter the number you want to see its table: ");
		num = input.nextInt();

		for (int i = 1; i <= 12; i++){
			int product = i * num;
			System.out.println(i + " x " + num + " = " + product);
		}
	}
}