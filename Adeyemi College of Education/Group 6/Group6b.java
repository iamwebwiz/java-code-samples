import java.util.*;
import java.io.*;

public class Group6b {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group6bOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		int count = 1;

		double[][] a1 = new double[5][4];
		System.out.println("Enter values for a1");
		for (int row=0; row<a1.length; row++){
			for (int col=0; col<a1[row].length; col++){
				// System.out.print("a1_" + count + ": ");
				// a1[row][col] = input.nextDouble();
				System.out.println("Values are being fetched...");
				a1[row][col] = (int)(Math.random()*100);
				count++;
			}
		}

		count = 1;
		double[][] a2 = new double[5][4];
		System.out.println("Enter values for a2");
		for (int row=0; row<a2.length; row++){
			for (int col=0; col < a2[row].length; col++){
				// System.out.print("a2_" + count + ": ");
				// a2[row][col] = input.nextDouble();
				System.out.println("Values are being fetched...");
				a2[row][col] = (int)(Math.random()*100);
				count++;
			}
		}

		count = 1;
		double[][] a3 = new double[5][4];
		System.out.println("Enter values for a3");
		for (int row = 0; row < a3.length; row++){
			for (int col = 0; col < a3[row].length; col++){
				// System.out.print("a3_" + count + ": ");
				// a3[row][col] = input.nextDouble();
				System.out.println("Values are being fetched...");
				a3[row][col] = (int)(Math.random()*100);
				count++;
			}
		}

		count = 1;
		double[][] a4 = new double[5][4];
		System.out.println("Enter values for a4");
		for (int row = 0; row < a4.length; row++){
			for (int col = 0; col < a4[row].length; col++){
				// System.out.print("a4_" + count + ": ");
				// a4[row][col] = input.nextDouble();
				System.out.println("Values are being fetched...");
				a4[row][col] = (int)(Math.random()*100);
				count++;
			}
		}

		count = 1;
		double[][] a5 = new double[5][4];
		System.out.println("Enter values for a5");
		for (int row = 0; row < a5.length; row++){
			for (int col = 0; col<a5[row].length; col++){
				// System.out.print("a5_" + count + ": ");
				// a5[row][col] = input.nextDouble();
				System.out.println("Values are being fetched...");
				a5[row][col] = (int)(Math.random()*100);
				count++;
			}
		}

		count = 1;
		double[][] product = new double[5][4];
		double[][] root = new double[5][4];
		for (int row=0; row<product.length; row++){
			for (int col=0; col<product[row].length; col++){
				product[row][col] = a1[row][col] * a2[row][col] * a3[row][col] * a4[row][col] * a5[row][col];
				root[row][col] = Math.pow(product[row][col], 0.2);
				System.out.println("The root of equation " + count + " is " + root[row][col]);
				count++;
			}
		}

		count = 1;
		try {
			for (int row = 0; row<product.length; row++){
				for (int col = 0; col < product[row].length; col++){
					builder.append("The root of equation " + count + " is " + root[row][col]);
					count++;
					if (col<root.length-1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			bw.write(builder.toString());
			bw.close();
		}
		catch (IOException e){
			System.out.println("Unable to write to file: ");
			e.printStackTrace();
		}
		catch (Exception e){
			System.out.println("An error occured: ");
			e.printStackTrace();
		}
	}
}
