import java.io.*;
import java.util.*;

public class Group5c {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = null;
		BufferedWriter bw = null;
		StringBuilder builder = new StringBuilder();

		// 2D arrays for radius and height and Area
		double[][] radius = new double[5][4];
		double[][] height = new double[5][4];
		double[][] A = new double[5][4];

		System.out.print("Enter value for PI: ");
		double PI = input.nextDouble();

		int count = 1;
		System.out.println("Enter values for radius and height");
		for (int row = 0; row < A.length; row++){
			for (int col = 0; col<A[row].length; col++){
				System.out.print("Radius_"+count+" = ");
				radius[row][col] = input.nextDouble();
				System.out.print("Height_" + count + " = ");
				height[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}

		count = 1;
		for (int row = 0; row < A.length; row++){
			for (int col=0; col < A[row].length; col++){
				A[row][col] = PI * Math.pow(radius[row][col],2) * height[row][col];
				System.out.println("Area_" + count + " = " + A[row][col]);
				count++;
			}
			System.out.println();
		}

		count = 1;
		try {
			fw = new FileWriter("Group5cOutput.txt");
			bw = new BufferedWriter(fw);
			for (int row=0; row < A.length; row++){
				for (int col=0; col < A[row].length; col++){
					builder.append("Area_" + count + " = " + A[row][col]);
					count++;
					if (col < A.length-1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			bw.write(builder.toString());
			bw.close();
		} catch (IOException err){
			System.out.println("Cannot write to file: ");
			err.printStackTrace();
		} catch (Exception err){
			System.out.println("An error occured: ");
			err.printStackTrace();
		}
	}
}
