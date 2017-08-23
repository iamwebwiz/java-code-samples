import java.io.*;
import java.util.*;

public class Group6a {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group6aOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		double pi;
		double[][] r = new double[5][4];
		double[][] h = new double[5][4];
		double[][] k = new double[5][4];
		double[][] numerator1 = new double[5][4];
		double[][] numerator2 = new double[5][4];
		double[][] fraction1 = new double[5][4];
		double[][] fraction2 = new double[5][4];
		double[][] v = new double[5][4];
		System.out.print("Enter value for PI: ");
		pi = input.nextDouble();
		int count = 1;
		System.out.println("Enter values for r, h and k");
		for (int row = 0; row < r.length; row++){
			for (int col =0; col<r[row].length; col++){
				System.out.print("r" + count + ": ");
				r[row][col] = input.nextDouble();
				System.out.print("h" + count + ": ");
				h[row][col] = input.nextDouble();
				System.out.print("k" + count + ": ");
				k[row][col] = input.nextDouble();
				count++;
			}
		}
		// loop to find numerators and fractions and the value of v
		for (int row=0; row < r.length; row++){
			for (int col = 0; col < r[row].length; col++){
				// find the numerators
				numerator1[row][col] = pi * Math.pow(r[row][col], 2) * h[row][col];
				numerator2[row][col] = pi * Math.pow(r[row][col], 2) * k[row][col];

				// find the fractions
				fraction1[row][col] = numerator1[row][col] / 3;
				fraction2[row][col] = numerator2[row][col] / 3;

				// find the value of v
				v[row][col] = fraction1[row][col] - fraction2[row][col];
			}
		}
		count = 1;
		// loop to print the values of v
		for (int row = 0; row < v.length; row++){
			for (int col=0; col < v[row].length; col++){
				System.out.println("v" + count + ": " + v[row][col] + " ");
				count++;
			}
			System.out.println();
		}
		count = 1;
		try {
			for (int row = 0; row < v.length; row++){
				for (int col = 0; col < v[row].length; col++){
					builder.append("v" + count + ": " + v[row][col] + " ");
					count++;
					if (col < v.length-1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			bw.write(builder.toString());
			bw.close();
		}
		catch (IOException e){
			System.out.println("Error while writing to file: ");
			e.printStackTrace();
		}
		catch (Exception e){
			System.out.println("An error occured: ");
			e.printStackTrace();
		}
	}
}
