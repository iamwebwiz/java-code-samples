import java.io.*;
import java.util.*;

public class Group3b {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group3bOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		double pi;
		double[][] r = new double[5][4];
		double[][] V = new double[5][4];

		System.out.print("Enter the value of pi: ");
		pi = input.nextDouble();

		int count = 1;
		System.out.println("Enter the values of r");
		for (int row = 0; row < V.length; row++){
			for (int col = 0; col < V[row].length; col++){
				System.out.print("r" + count + " = ");
				r[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}

		count = 1;
		for (int row = 0; row < V.length; row++){
			for (int col = 0; col < V[row].length; col++){
				V[row][col] = (4 * pi * Math.pow(r[row][col], 3)) / 3;
				System.out.println("V_" + count + " = " + V[row][col]);
				count++;
			}
			System.out.println();
		}

		count = 1;
		try {
			for (int row = 0; row < V.length; row++){
				for (int col = 0; col < V[row].length; col++){
					builder.append("V_" + count + " = " + V[row][col]);
					count++;
					if (col < V.length-1){
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
