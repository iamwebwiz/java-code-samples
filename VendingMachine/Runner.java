public class Runner {
	public static void main(String[] args) {
		
		VendingMachine vender = new VendingMachine();
		
		vender.displayOptions();
		vender.takeCustomerOrder();
		vender.machineResponse();
	}
}