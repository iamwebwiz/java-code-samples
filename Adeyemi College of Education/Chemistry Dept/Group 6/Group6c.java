import java.io.*;
import java.util.*;

public class Group6c {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] m = new double[5][4];
		double[][] v = new double[5][4];
		double[][] u = new double[5][4];
		double[][] t = new double[5][4];
		double[][] F = new double[5][4];
		int count=1;
		for (int row = 0; row < F.length; row++){
			for (int col=0; col < F[row].length; col++){
				System.out.print("m"+count+" = ");
				m[row][col] = input.nextDouble();
				System.out.print("v"+count+" = ");
				v[row][col] = input.nextDouble();
				System.out.print("u"+count+" = ");
				u[row][col] = input.nextDouble();
				System.out.print("t"+count+" = ");
				t[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count=1;
		for (int row = 0; row < F.length; row++){
			for (int col = 0; col < F[row].length; col++){
				F[row][col] = m[row][col] * ((v[row][col] - u[row][col])/t[row][col]);
				System.out.println("F"+count+" = " + F[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try {
			file = new FileWriter("Group6cOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for (int row=0; row<F.length; row++){
				for (int col=0; col<F[row].length; col++){
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
		catch(Exception err){
			System.out.println("An error occured");
			err.printStackTrace();
		}
	}
}