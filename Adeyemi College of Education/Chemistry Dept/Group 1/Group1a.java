import java.io.*;
import java.util.*;

public class Group1a{
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] r = new double[5][4];
		double[][] h = new double[5][4];
		double[][] SA = new double[5][4];
		double PI;
		System.out.print("Enter value for PI: ");
		PI = input.nextDouble();
		int count=1;
		for (int row=0; row<SA.length; row++){
			for (int col=0; col<SA[row].length; col++){
				System.out.print("r"+count+" = ");
				r[row][col] = input.nextDouble();
				System.out.print("h"+count+" = ");
				h[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count=1;
		for (int row=0; row<SA.length; row++){
			for(int col=0; col<SA[row].length; col++){
				SA[row][col] = (2*PI*r[row][col]) * (r[row][col] + h[row][col]);
				System.out.println("SA"+count+" = " + SA[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try {
			file = new FileWriter("Group1aOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for (int row=0; row<SA.length; row++){
				for (int col=0; col<SA.length; col++){
					build.append("SA"+count+" = " + SA[row][col]);
					count++;
					if(col<SA.length-1){
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