import java.util.*;
import java.io.*;

public class Group2b {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group2bOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		int count = 1;
		double[][] m = new double[5][4];
		System.out.println("Enter values for m");
		for (int row = 0; row < m.length; row++){
			for (int col = 0; col<m[row].length; col++){
				System.out.print("m"+(count)+": ");
				m[row][col] = scan.nextDouble();
				count++;
			}
		}

		double g = 10;
		System.out.println();

		count = 1;
		double[][] h = new double[5][4];
		System.out.println("Enter values for h");
		for (int row=0; row<h.length; row++){
			for (int col=0; col<h[row].length; col++){
				System.out.print("h"+(count)+": ");
				h[row][col] = scan.nextDouble();
				count++;
			}
		}
		System.out.println();

		count = 1;
		double[][] PE = new double[5][4];
		for (int row=0; row<PE.length; row++){
			for (int col=0; col<PE[row].length; col++){
				PE[row][col] = m[row][col] * g * h[row][col];
				System.out.println("PE"+(count)+": " + PE[row][col] + " ");
				count++;
			}
			System.out.println();
		}

		count = 1;
		try {
			for (int row = 0; row<PE.length; row++){
				for (int col=0; col<PE[row].length; col++){
					builder.append("PE"+(count) + ": " + PE[row][col] + " ");
					count++;
					if (col<PE.length-1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			bw.write(builder.toString());
			bw.close();
		}
		catch (IOException e){
			System.out.println("An error occured: ");
			e.printStackTrace();
		}
		catch (Exception e){
			System.out.println("An error occured: ");
			e.printStackTrace();
		}
	}
}