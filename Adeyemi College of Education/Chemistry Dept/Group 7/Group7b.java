import java.io.*;
import java.util.*;

public class Group7b {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] V = new double[5][4];
		double[][] r = new double[5][4];
		double[][] h = new double[5][4];
		double PI;
		System.out.print("Enter value for PI: ");
		PI = input.nextDouble();
		int count = 1;
		for (int row = 0; row < V.length; row++){
			for (int col = 0; col < V[row].length; col++){
				System.out.print("r"+count+" = ");
				r[row][col] = input.nextDouble();
				System.out.print("h"+count+" = ");
				h[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count=1;
		for (int row = 0; row < V.length; row++){
			for (int col = 0; col < V[row].length; col++){
				V[row][col] = (4/3) * PI * Math.pow(r[row][col], 2) * h[row][col];
				System.out.println("V" + count + " = " + V[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try {
			file = new FileWriter("Group7bOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for (int row=0; row<V.length; row++){
				for (int col=0; col<V[row].length; col++){
					build.append("V" + count + " = " + V[row][col] + "\n");
					count++;
				}
				build.append("\n");
			}
			writer.write(build.toString());
			writer.close();
		}
		catch (IOException e) {
			System.out.println("An error occured");
			e.printStackTrace();
		}
		catch (Exception e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}