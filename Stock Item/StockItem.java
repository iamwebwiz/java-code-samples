class StockItem {

	private final String stockNumber;
	private final String name;
	private double price;
	private int totalStock;
	private static double salesTax;

	public static void setSalesTax(double tax){
		salesTax = tax;
	}

	public StockItem(String stockNumber, String name, double price){
		this.stockNumber = stockNumber;
		this.name = name;
		this.price = price;
		totalStock = 0;
	}

	public void setPrice(double price){
		this.price = price;
	}

	public void increaseTotalStock(int num){
		this.totalStock += num;
	}

	public String getStockNumber(){
		return this.stockNumber;
	}

	public String getName(){
		return this.name;
	}

	public int getTotalStock(){
		return this.totalStock;
	}

	public double getPrice(){
		return this.price;
	}

	public double calculateTotalPrice(){
		double totalPrice = this.totalStock * this.price;
		return totalPrice;
	}
}