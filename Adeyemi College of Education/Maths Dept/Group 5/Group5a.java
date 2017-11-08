import java.io.*;
import java.util.*;

public class Group5a {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		int count = 1;
		double[][] n = new double[5][4];
		double[][] X = new double[5][4];
		System.out.println("Enter values for n");
		for (int row = 0; row < X.length; row++){
			for (int col = 0; col < X[row].length; col++){
				System.out.print("n" + count + " = ");
				n[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		double[][] sum1 = new double[5][4];
		double[][] sum2 = new double[5][4];
		double[][] sum3 = new double[5][4];
		double[][] sum4 = new double[5][4];
		for (int row = 0; row < X.length; row++){
			for (int col = 0; col < X[row].length; col++){
				sum1[row][col] = n[row][col] + 1;
				sum2[row][col] = n[row][col] + 2;
				sum3[row][col] = n[row][col] + 3;
				sum4[row][col] = n[row][col] + 4;
			}
		}
		count=1;
		for (int row = 0; row < X.length; row++){
			for (int col = 0; col < X[row].length; col++){
				X[row][col] = (n[row][col] * sum1[row][col] * sum2[row][col] * sum3[row][col]) / 3 * sum4[row][col];
				System.out.println("X_" + count + " = " + X[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try {
			file = new FileWriter("Group5aOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for (int row = 0; row < X.length; row++){
				for (int col = 0; col < X[row].length; col++){
					build.append("X_" + count + " = " + X[row][col] + "\n");
				}
				build.append("\n");
			}
			writer.write(build.toString());
			writer.close();
		}
		catch (IOException err){
			System.out.println("Unable to write to file: ");
			err.printStackTrace();
		}
		catch (Exception err){
			System.out.println("An error occured!");
			err.printStackTrace();
		}
	}
}