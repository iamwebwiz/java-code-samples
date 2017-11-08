import java.io.*;
import java.util.*;

public class Group4a {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] V = new double[5][4];
		double[][] I = new double[5][4];
		double[][] R = new double[5][4];
		int count=1;
		for(int row=0; row<V.length; row++){
			for (int col=0; col<V[row].length; col++){
				System.out.print("I"+count+" = ");
				I[row][col] = input.nextDouble();
				System.out.print("R"+count+" = ");
				R[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count=1;
		for (int row=0; row<V.length; row++){
			for (int col=0; col<V[row].length; col++){
				V[row][col] = I[row][col] * R[row][col];
				System.out.println("V"+count+" = " + V[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try {
			file = new FileWriter("Group4aOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for (int row = 0; row < V.length; row++){
				for (int col = 0; col < V[row].length; col++){
					build.append("V"+count+" = " + V[row][col]);
					count++;
					if(col<V.length-1){
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