import java.io.*;
import java.util.*;

public class Group3a {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group3aOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		double pi;
		double[][] Y = new double[5][4];
		double[][] A = new double[5][4];
		double[][] f = new double[5][4];
		double[][] t = new double[5][4];

		System.out.print("Enter value for PI: ");
		pi = input.nextDouble();

		int count = 1;
		System.out.println("Enter the values of A, f and t");
		for (int row = 0; row < Y.length; row++){
			for (int col = 0; col < Y[row].length; col++){
				System.out.print("A_" + count + " = ");
				A[row][col] = input.nextDouble();
				System.out.print("f_" + count + " = ");
				f[row][col] = input.nextDouble();
				System.out.print("t_" + count + " = ");
				t[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}

		count = 1;
		for (int row = 0; row < Y.length; row++){
			for (int col = 0; col < Y[row].length; col++){
				Y[row][col] = A[row][col] * Math.sin(2 * pi * f[row][col] * t[row][col]);
				System.out.println("Y_" + count + " = " + Y[row][col]);
				count++;
			}
			System.out.println();
		}

		count = 1;
		try {
			for (int row = 0; row < Y.length; row++){
				for (int col = 0; col < Y[row].length; col++){
					builder.append("Y_" + count + " = " + Y[row][col]);
					count++;
					if (col < Y.length-1){
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
