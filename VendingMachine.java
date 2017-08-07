import java.util.Scanner;

public class VendingMachine {
	static Scanner sc = new Scanner(System.in);

	private String[] options = {
		"[1] Get gum",
		"[2] Get chocolate",
		"[3] Get popcorn",
		"[4] Get juice",
		"[5] Display total sold so far",
		"[6] Quit"
	};

	private String[] replies = {
		"Here is your gum",
		"Here is your chocolate",
		"Here is your popcorn",
		"Here is your juice"
	};

	private int gumSold, chocoSold, popcornSold, juiceSold;

	public VendingMachine(){
		this.gumSold = 0;
		this.chocoSold = 0;
		this.popcornSold = 0;
		this.juiceSold = 0;
	}

	public void increase(int itemSold){
		switch (itemSold){
			case 1:
				gumSold++;
				break;
			case 2:
				chocoSold++;
				break;
			case 3:
				popcornSold++;
				break;
			case 4:
				juiceSold++;
				break;
		}
	}

	private int choice;

	public void displayOptions(){
		for (String option: options){
			System.out.println(option);
		}
	}

	public void machineResponse(){
		while (choice > 0 && choice < 7){
			if (choice==5){
				totalSold();
				System.out.println();
				displayOptions();
				takeCustomerOrder();
			}
			else if (choice==6){
				System.out.println("Exiting...");
				break;
			}
			else {
				System.out.println(replies[choice-1]);
				increase(choice);
				System.out.println();
				displayOptions();
				takeCustomerOrder();
			}
		}
	}

	public void totalSold(){
		System.out.println("Gum sold: " + gumSold);
		System.out.println("Chocolate sold: " + chocoSold);
		System.out.println("Popcorn sold: " + popcornSold);
		System.out.println("Juice sold: " + juiceSold);
	}

	public void takeCustomerOrder(){
		System.out.println();
		System.out.print("What do you want? ");
		this.choice = sc.nextInt();
	}

	public static void main(String[] args) {
		
		VendingMachine vender = new VendingMachine();
		
		vender.displayOptions();
		vender.takeCustomerOrder();
		vender.machineResponse();
	}
}
