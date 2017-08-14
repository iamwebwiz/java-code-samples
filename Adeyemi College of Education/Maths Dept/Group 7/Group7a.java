import java.io.*;
import java.util.*;

public class Group7a {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group7aOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		double[][] a = new double[5][4];
		double[][] b = new double[5][4];
		double[][] c = new double[5][4];
		double[][] d = new double[5][4];
		double[][] e = new double[5][4];
		double[][] X = new double[5][4];

		int count = 1;
		// Insert values for a, b, c, d and e
		for (int row = 0; row < X.length; row++){
			for (int col =0; col < X[row].length; col++){
				System.out.print("a" + count + " = ");
				a[row][col] = input.nextInt();

				System.out.print("b" + count + " = ");
				b[row][col] = input.nextInt();

				System.out.print("c" + count + " = ");
				c[row][col] = input.nextInt();

				System.out.print("d" + count + " = ");
				d[row][col] = input.nextInt();

				System.out.print("e" + count + " = ");
				e[row][col] = input.nextInt();
				count++;
				System.out.println();
			}
		}

		// Calculate and display the value of X
		count = 1;
		for (int row=0; row < X.length; row++){
			for (int col = 0; col < X[row].length; col++){
				X[row][col] = ((a[row][col] * Math.pow(b[row][col], 3))/Math.asin(c[row][col])) + d[row][col] - e[row][col];
				System.out.println("X" + count + " = " + X[row][col]);
				count++;
			}
			System.out.println();
		}

		// Write data to file
		count = 1;
		try {
			for (int row = 0; row < X.length; row++){
				for (int col = 0; col < X[row].length; col++){
					builder.append("X" + count + " = " + X[row][col]);
					count++;
					if (col < X.length-1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			bw.write(builder.toString());
			bw.close();
		}
		catch (IOException err){
			System.out.println("Unable to write to file: ");
			err.printStackTrace();
		}
		catch (Exception err){
			System.out.println("An error occured: ");
			err.printStackTrace();
		}
	}
}
