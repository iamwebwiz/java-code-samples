import java.io.*;
import java.util.*;

public class Group2a {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = NULL;
		BufferedWriter writer = NULL;
		StringBuilder build = NULL;

		System.out.print("Enter value for PI: ");
		double PI = input.nextDouble();

		double[][] L = new double[5][4];
		double[][] G = new double[5][4];
		double[][] T = new double[5][4];
		int count = 1;
		for(int row=0; row<T.length; row++){
			for(int col=0; col<T[row].length; col++){
				System.out.print("L"+count+" = ");
				L[row][col] = input.nextDouble();
				System.out.print("G"+count+" = ");
				G[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count = 1;
		for (int row=0; row<T.length; row++){
			for(int col=0; col<T[row].length; col++){
				T[row][col] = 2*PI * Math.sqrt(L[row][col] / G[row][col]);
				System.out.println("T" + count + " = " + T[row][col]);
				count++;
			}
			System.out.println();
		}

		count = 1;
		try {
			file = new FileWriter("Group2aOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for (int row=0; row < T.length; row++){
				for(int col=0; col<T[row].length; col++){
					build.append("T" + count + " = " + T[row][col]);
					count++;
					if (col < T.length-1){
						build.append("\n");
					}
				}
				build.append("\n");
			}
			writer.write(build.toString());
			writer.close();
		}
		catch (IOException err){
			System.out.println("An error occured");
			err.printStackTrace();
		}
		catch (Exception err){
			System.out.println("An error occured");
			err.printStackTrace();
		}
	}
}