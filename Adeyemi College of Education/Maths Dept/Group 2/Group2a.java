import java.util.*;
import java.io.*;

public class Group2a {
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group2aOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		int count = 1;
		double[][] a = new double[5][4];
		System.out.println("Enter values for a");
		for (int row=0; row<a.length; row++){
			for (int col=0; col<a[row].length; col++){
				// System.out.print("a" + count + ": ");
				// a[row][col] = input.nextDouble();
				System.out.println("Values are being fetched...");
				a[row][col] = (int)(Math.random()*100);
				count++;
			}
		}

		count = 1;
		double[][] b = new double[5][4];
		System.out.println("Enter values for b");
		for (int row=0; row<b.length; row++){
			for (int col=0; col<b[row].length; col++){
				// System.out.print("b" + count + ": ");
				// b[row][col] = input.nextDouble();
				System.out.println("Values are being fetched...");
				b[row][col] = (int)(Math.random()*100);
				count++;
			}
		}

		count = 1;
		double[][] c = new double[5][4];
		System.out.println("Enter values for c");
		for (int row=0; row<c.length; row++){
			for (int col=0; col<c[row].length; col++){
				// System.out.print("c" + count + ": ");
				// c[row][col] = input.nextDouble();
				System.out.println("Values are being fetched...");
				c[row][col] = (int)(Math.random()*100);
				count++;
			}
		}

		count = 1;
		double[][] rootValue = new double[5][4];
		for (int row=0; row<rootValue.length; row++){
			for (int col=0; col<rootValue[row].length; col++){
				rootValue[row][col] = Math.pow(b[row][col], 2) - (4 * a[row][col] * c[row][col]);
			}
		}

		count = 1;
		double[][] root1 = new double[5][4];
		double[][] root2 = new double[5][4];
		for (int row=0; row<root1.length; row++){
			for (int col=0; col<root1[row].length; col++){
				if (rootValue[row][col] > 0){
					root1[row][col] = (-b[row][col] + Math.sqrt(rootValue[row][col])) / (2*a[row][col]);
					root2[row][col] = (-b[row][col] - Math.sqrt(rootValue[row][col])) / (2*a[row][col]);
					System.out.println("Equation "+count+" have two solutions: "+root1[row][col]+" and " + root2[row][col]);
					count++;
				}
				else if (rootValue[row][col] == 0){
					root1[row][col] = (-b[row][col] + Math.sqrt(rootValue[row][col])) / (2*a[row][col]);
					System.out.println("Equation "+count+" has one solutions: "+root1[row][col]);
					count++;
				}
				else {
					System.out.println("Equation " + count + " has no solution");
					count++;
				}
			}
			System.out.println();
		}

		count = 1;
		try {
			for (int row=0; row<root1.length; row++){
				for (int col=0; col<root1[row].length; col++){
					if (rootValue[row][col] > 0){
						builder.append("Equation "+count+" have two solutions: "+root1[row][col]+" and " + root2[row][col]);
						count++;
					}
					else if (rootValue[row][col] == 0){
						builder.append("Equation "+count+" has one solutions: "+root1[row][col]);
						count++;
					}
					else {
						builder.append("Equation " + count + " has no solution");
						count++;
					}
					if (col<root1.length-1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			bw.write(builder.toString());
			bw.close();
		}
		catch (IOException e){
			System.out.println("Error occured while writing to file: ");
			e.printStackTrace();
		}
		catch (Exception e){
			System.out.println("An error occured: ");
			e.printStackTrace();
		}
	}
}
