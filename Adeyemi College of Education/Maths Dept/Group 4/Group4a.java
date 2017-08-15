import java.io.*;
import java.util.*;

public class Group4a {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group4aOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		double[][] a = new double[5][4];
		double[][] b = new double[5][4];
		double[][] h = new double[5][4];
		double[][] A = new double[5][4];

		int count = 1;
		System.out.println("Enter values for a, b and h");
		for (int row = 0; row < A.length; row++){
			for (int col = 0; col < A[row].length; col++){
				System.out.print("a_" + count + " = ");
				a[row][col] = input.nextDouble();
				System.out.print("b_" + count + " = ");
				b[row][col] = input.nextDouble();
				System.out.print("h_" + count + " = ");
				h[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}

		count = 1;
		for (int row = 0; row<A.length; row++) {
			for (int col = 0; col < A[row].length; col++){
				A[row][col] = ((a[row][col] + b[row][col]) * h[row][col]) / 2;
				System.out.println("A_" + count + " = " + A[row][col]);
				count++;
			}
			System.out.println();
		}

		count = 1;
		try {
			for (int row = 0; row<A.length; row++) {
				for (int col = 0; col < A[row].length; col++){
					builder.append("A_" + count + " = " + A[row][col]);
					count++;
					if (col < A.length-1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			bw.write(builder.toString());
			bw.close();
		}
		catch (IOException err){
			System.out.println("Cannot write to file: ");
			err.printStackTrace();
		}
		catch (Exception err){
			System.out.println("An error occured: ");
			err.printStackTrace();
		}
	}
}
