import java.util.*;

public class StockItemTest {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String tempNumber;
		String tempName;
		double tempPrice;

		System.out.print("ENTER THE STOCK NUMBER: ");
		tempNumber = keyboard.nextLine();
		System.out.print("ENTER THE NAME OF THE ITEM: ");
		tempName = keyboard.nextLine();
		System.out.print("ENTER THE PRICE OF THE ITEM: ");
		tempPrice = keyboard.nextDouble();

		// create a new item of stock using the values entered by user
		StockItem item1 = new StockItem(tempNumber, tempName, tempPrice);

		// increase total number of items in stock by 5
		item1.increaseTotalStock(5);
		System.out.println();

		// display the stock number
		System.out.println("STOCK NUMBER: " + item1.getStockNumber());

		// display the total price of all items in stock
		System.out.println("TOTAL PRICE: " + item1.calculateTotalPrice());
	}
}