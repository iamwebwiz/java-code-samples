public class simple {
	public static void main(String[] args) {
		for (int a = 1; a < 11; a++) {
			if (a == 5) {
				continue;
			}
			System.out.println(a);
		}
	}
}