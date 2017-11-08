import java.io.*;
import java.util.*;

public class Group8c {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] R = new double[5][4];
		double[][] r = new double[5][4];
		double[][] t = new double[5][4];
		double[][] A = new double[5][4];
		double[][] tetha = new double[5][4];
		double PI;
		int count = 1;
		System.out.print("Enter value for PI: ");
		PI = input.nextDouble();
		for (int row=0; row < A.length; row++){
			for (int col=0; col < A[row].length; col++){
				System.out.print("tetha_"+count+" = ");
				tetha[row][col] = input.nextDouble();
				System.out.print("R_"+count+" = ");
				R[row][col] = input.nextDouble();
				System.out.print("r_"+count+" = ");
				r[row][col] = input.nextDouble();
				System.out.print("t_"+count+" = ");
				t[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count=1;
		for (int row=0; row<A.length; row++){
			for (int col=0; col<A[row].length; col++){
				A[row][col] = (tetha[row][col]*PI*Math.pow(R[row][col],2))/360 - (Math.pow(r[row][col],2) * Math.sin(t[row][col]))/2;
				System.out.println("A_"+count+" = " + A[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try {
			file = new FileWriter("Group8cOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for (int row = 0; row < A.length; row++){
				for (int col = 0; col < A[row].length; col++){
					build.append("A_"+count+" = " + A[row][col] + "\n");
					count++;
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
			System.out.println("An error occured: ");
			err.printStackTrace();
		}
	}
}