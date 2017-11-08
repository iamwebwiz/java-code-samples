import java.util.*;
import java.io.*;

public class Group8b {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter bw = null;
		StringBuilder builder = null;
		double[][] g = new double[5][4];
		double[][] f = new double[5][4];
		double[][] c = new double[5][4];
		double[][] r = new double[5][4];
		int count = 1;
		System.out.println("Enter values for g, f and c");
		for (int row=0; row < r.length; row++){
			for (int col = 0; col < r[row].length; col++){
				System.out.print("g_" + count + " = ");
				g[row][col] = input.nextDouble();
				System.out.print("f_" + count + " = ");
				f[row][col] = input.nextDouble();
				System.out.print("c_" + count + " = ");
				c[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count = 1;
		for (int row = 0; row < r.length; row++){
			for (int col = 0; col < r[row].length; col++){
				r[row][col] = Math.sqrt(Math.pow(g[row][col],2) + Math.pow(f[row][col],2) - c[row][col]);
				System.out.println("r_" + count + " = " + r[row][col]);
				count++;
			}
			System.out.println();
		}
		count = 1;
		try {
			file = new FileWriter("Group8bOutput.txt");
			bw = new BufferedWriter(file);
			builder = new StringBuilder();
			for (int row = 0; row < r.length; row++){
				for (int col = 0; col < r[row].length; col++){
					builder.append("r_" + count + " = " + r[row][col]);
					count++;
					if (col < r.length-1){
						builder.append("\n");
					}
				}
				builder.append("\n");
			}
			bw.write(builder.toString());
			bw.close();
		} catch (IOException err){
			System.out.println("Unable to write to file; ");
			err.printStackTrace();
		} catch (Exception err){
			System.out.println("An error occured: ");
			err.printStackTrace();
		}
	}
}