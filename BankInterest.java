import java.util.Scanner;
public class BankInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		final double interest_A = 0.15,
					interest_B = 0.02,
					interest_C = 0.15,
					interest_X = 0.05;
		double interest;

		System.out.print("Enter the amount of money you want to calculate its interest: ");
		double amtOfMoney = sc.nextDouble();

		System.out.print("Enter the type of bank account: ");
		String bankAccType = sc.next();
		bankAccType = bankAccType.toUpperCase();

		switch (bankAccType){
			case "A":
				interest = amtOfMoney * interest_A;
				System.out.println("Account type: " + bankAccType);
				System.out.println("Amount of Money: " + amtOfMoney);
				System.out.println("Annual Interest: " + interest);
				break;
			case "B":
				interest = amtOfMoney * interest_B;
				System.out.println("Account type: " + bankAccType);
				System.out.println("Amount of Money: " + amtOfMoney);
				System.out.println("Annual Interest: " + interest);
				break;
			case "C":
				interest = amtOfMoney * interest_C;
				System.out.println("Account type: " + bankAccType);
				System.out.println("Amount of Money: " + amtOfMoney);
				System.out.println("Annual Interest: " + interest);
				break;
			case "X":
				interest = amtOfMoney * interest_X;
				System.out.println("Account type: " + bankAccType);
				System.out.println("Amount of Money: " + amtOfMoney);
				System.out.println("Annual Interest: " + interest);
				break;
			default:
				System.out.println("Invalid Account type entered");
		}
	}
}