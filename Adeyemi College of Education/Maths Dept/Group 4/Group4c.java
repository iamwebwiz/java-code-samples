import java.io.*;
import java.util.*;

// formula: A = tetha/360 * 2*PI*r

public class Group4c {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		StringBuilder builder = new StringBuilder();

		double[][] tetha = new double[5][4];
		double[][] radius = new double[5][4];
		double[][] A = new double[5][4];
		double PI;

		System.out.print("Enter value for PI: ");
		PI = input.nextDouble();

		int count = 1;
		System.out.println("Enter values for tetha and radius");
		for (int row = 0; row < A.length; row++){
			for (int col=0; col < A[row].length; col++){
				System.out.print("tetha_"+count+" = ");
				tetha[row][col] = input.nextDouble();
				System.out.print("radius_"+count+" = ");
				radius[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}

		count = 1;
		for (int row = 0; row < A.length; row++){
			for (int col=0; col<A[row].length; col++){
				A[row][col] = (tetha[row][col] * 2 * PI * radius[row][col]) / 360;
				System.out.println("A_"+count+" = " + A[row][col]);
				count++;
			}
			System.out.println();
		}

		count = 1;
		try {
			fw = new FileWriter("Group4cOutput.txt");
			bw = new BufferedWriter(fw);
			for (int row = 0; row < A.length; row++){
				for (int col = 0; col < A[row].length; col++){
					builder.append("A_"+count+" = " + A[row][col]);
					count++;
					if (col < A.length-1){
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
