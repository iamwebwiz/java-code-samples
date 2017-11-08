import java.util.*;
import java.io.*;

// A^2 = B^2 + C^2 - 2BCcosA

public class Group1a {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group1aOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		double[][] B = new double[5][4];
		double[][] C = new double[5][4];
		double[][] a = new double[5][4];
		double[][] A = new double[5][4];

		try {
			InputStream is = new FileInputStream("Group1aInput.txt");
			int value = 0;

			for (int i = 0; i < A.length; i++) {
			   for (int j = 0; j < A[row].length; j++) {
			      try{
			        int value = is.read();
			        if (value == -1) break;
			         a[i][j] = value;
			         System.out.println("number is "+ a[i][j]);
			        }
			        catch (Exception e) {
			          e.printStackTrace();
			        }
			    }//j
			 } //i
		}
		// enter values for B, C and a
		System.out.println("Enter values for B, C and a");
		for (int row = 0; row < A.length; row++){
			for (int col = 0; col < A[row].length; col++){
				System.out.print("B" + count + " = ");
				B[row][col] = input.nextDouble();

				System.out.print("C" + count + " = ");
				C[row][col] = input.nextDouble();

				System.out.print("a" + count + " = ");
				a[row][col] = input.nextDouble();

				System.out.println();
				count++;
			}
		}

		// calculate the value of A^2 on each of the values
		count = 1;
		for (int row = 0; row<A.length; row++){
			for (int col=0; col < A[row].length; col++){
				double rhs; // variable to hold values in the right hand side
				rhs = Math.pow(B[row][col], 2) + Math.pow(C[row][col], 2) - (2 * B[row][col] * C[row][col] * Math.cos(a[row][col]));
				A[row][col] = Math.sqrt(rhs);
				// display the values of A^2
				System.out.println("A^2_" + count + " = " + Math.pow(A[row][col], 2));
				count++;
			}
			System.out.println();
		}

		// write to file
		count = 1;
		try {
			for (int row = 0; row < A.length; row++){
				for (int col = 0; col < A[row].length; col++){
					builder.append("A^2_" + count + " = " + Math.pow(A[row][col], 2));
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
