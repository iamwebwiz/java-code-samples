import java.io.*;
import java.util.*;

public class Group2b {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] L = new double[5][4];
		double[][] C = new double[5][4];
		double[][] F = new double[5][4];
		System.out.print("Enter the value for PI: ");
		double PI = input.nextDouble();
		int count = 1;
		for(int row = 0; row<F.length; row++){
			for(int col = 0; col < F[row].length; col++){
				System.out.print("L" + count + " = ");
				L[row][col] = input.nextDouble();
				System.out.print("C" + count + " = ");
				C[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count = 1;
		for(int row=0; row<F.length; row++){
			for(int col=0; col<F[row].length; col++){
				F[row][col] = 1 / (2*PI * Math.sqrt(L[row][col] * C[row][col]));
				System.out.println("F"+count+" = " + F[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try{
			file = new FileWriter("Group2bOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for(int row=0; row<F.length; row++){
				for(int col=0; col<F[row].length; col++){
					build.append("F"+count+" = " + F[row][col]);
					count++;
					if (col<F.length-1){
						build.append("\n");
					}
				}
				build.append("\n");
			}
			writer.write(build.toString());
			writer.close();
		}
		catch(IOException err){
			System.out.println("An error occured");
			err.printStackTrace();
		}
		catch (Exception err){
			System.out.println("An error occured");
			err.printStackTrace();
		}
	}
}