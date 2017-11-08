import java.io.*;
import java.util.*;

public class Group5b {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder builder = null;

		double[][] B = new double[5][4];
		double[][] C = new double[5][4];
		double[][] A = new double[5][4];

		int count = 1;

		// collect values for B and C
		System.out.println("Enter values for B and C");
		for (int row = 0; row < A.length; row++){
			for (int col = 0; col < A[row].length; col++){
				System.out.print("B" + count + " = ");
				B[row][col] = input.nextDouble();

				System.out.print("C" + count + " = ");
				C[row][col] = input.nextDouble();

				count++;
				System.out.println();
			}
		}

		// calculate and display the values of A
		count = 1;
		for (int row=0; row < A.length; row++){
			for (int col=0; col<A[row].length; col++){
				A[row][col] = Math.sqrt(Math.pow(B[row][col],2) + Math.pow(C[row][col], 2)) / 2;
				System.out.println("A" + count + " = " + A[row][col]);
				count++;
			}
			System.out.println();
		}

		// write data to file
		count = 1;
		try {
			file = new FileWriter("Group5bOutput.txt");
			writer = new BufferedWriter(file);
			builder = new StringBuilder();
			for (int row = 0; row < A.length; row++){
				for (int col = 0; col < A[row].length; col++){
					builder.append("A" + count + " = " + A[row][col]);
					count++;
					if (col < A.length-1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			writer.write(builder.toString());
			writer.close();
		}
		catch (IOException error){
			System.out.println("Unable to write to file: ");
			error.printStackTrace();
		}
		catch (Exception error){
			System.out.println("An error occured: ");
			error.printStackTrace();
		}
	}
}
