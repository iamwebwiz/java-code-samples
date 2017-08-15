import java.io.*;
import java.util.*;

public class Group1b {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group1bOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		double[][] P = new double[5][4];
		double[][] R = new double[5][4];
		double[][] T = new double[5][4];
		double[][] SI = new double[5][4];

		int count = 1;
		// Enter values for P, R and T to calculate the SI unit
		System.out.println("Enter values for P, R and T");
		for (int row = 0; row < SI.length; row++){
			for (int col = 0; col < SI[row].length; col++){
				System.out.print("P" + count + " = ");
				P[row][col] = input.nextDouble();

				System.out.print("R" + count + " = ");
				R[row][col] = input.nextDouble();

				System.out.print("T" + count + " = ");
				T[row][col] = input.nextDouble();

				System.out.println();
				count++;
			}
		}

		// calculate the simple interest on each of the values
		count = 1;
		for (int row = 0; row<SI.length; row++){
			for (int col=0; col < SI[row].length; col++){
				SI[row][col] = (P[row][col] * R[row][col] * T[row][col]) / 100;
				// display the values of simple interest
				System.out.println("SI_" + count + " = " + SI[row][col]);
				count++;
			}
			System.out.println();
		}

		// write data to file
		count = 1;
		try {
			for (int row = 0; row < SI.length; row++){
				for (int col = 0; col < SI[row].length; col++){
					builder.append("SI_" + count + " = " + SI[row][col]);
					count++;
					if (col < SI.length - 1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			bw.write(builder.toString());
			bw.close();
		}
		catch (IOException err){
			System.out.println("Could not write data to file...");
			err.printStackTrace();
		}
		catch (Exception err){
			System.out.println("An error occured");
			err.printStackTrace();
		}
	}
}
