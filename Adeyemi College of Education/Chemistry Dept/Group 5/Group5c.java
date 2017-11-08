import java.io.*;
import java.util.*;

// PV = nRT; V = nRT/P

public class Group5c {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder builder = null;

		double[][] R = new double[5][4];
		double[][] P = new double[5][4];
		double[][] T = new double[5][4];
		double[][] V = new double[5][4];
		double[][] n = new double[5][4];

		int count = 1;

		// get values for n, R, T and P
		System.out.println("Enter values for n, R, T and  P");
		for (int row = 0; row < R.length; row++){
			for (int col = 0; col < R[row].length; col++){
				System.out.print("n"+count+" = ");
				n[row][col] = input.nextDouble();

				System.out.print("R"+count+" = ");
				R[row][col] = input.nextDouble();
				
				System.out.print("T"+count+" = ");
				T[row][col] = input.nextDouble();

				System.out.print("P"+count+" = ");
				P[row][col] = input.nextDouble();
				count++;
				System.out.println();
			}
		}

		// calculate the values of V
		count = 1;
		for (int row = 0; row<R.length; row++){
			for (int col=0; col<R[row].length; col++){
				V[row][col] = (n[row][col] * R[row][col] * T[row][col]) / P[row][col];
				System.out.println("V" + count + " = " + V[row][col] + "\t");
				count++;
			}
			System.out.println();
		}

		count = 1;
		try {
			file = new FileWriter("Group5cOutput.txt");
			writer = new BufferedWriter(file);
			builder = new StringBuilder();
			for (int row=0; row < R.length; row++){
				for (int col = 0; col < R[row].length; col++){
					builder.append("V" + count + " = " + V[row][col] + "\t");
					count++;
					if (col<V.length-1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			writer.write(builder.toString());
			writer.close();
		}
		catch (IOException e){
			System.out.println("Unable to write to file");
			e.printStackTrace();
		}
		catch (Exception e){
			System.out.println("An error occured!");
			e.printStackTrace();
		}
	}
}
