import java.io.*;
import java.util.*;

public class Group2c {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] l = new double[5][4];
		double[][] b = new double[5][4];
		double[][] h = new double[5][4];
		double[][] V = new double[5][4];
		int count = 1;
		for (int row=0; row<V.length; row++){
			for (int col=0; col<V[row].length; col++){
				System.out.print("l"+count+" = ");
				l[row][col] = input.nextDouble();
				System.out.print("b"+count+" = ");
				b[row][col] = input.nextDouble();
				System.out.print("h"+count+" = ");
				h[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count=1;
		for (int row=0; row<V.length; row++){
			for (int col=0; col<V[row].length; col++){
				V[row][col] = l[row][col] * b[row][col] * h[row][col];
				System.out.println("V"+count+" = " + V[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try{
			file = new FileWriter("Group2cOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for (int i=0; i<V.length; i++){
				for (int j=0; j<V[i].length; j++){
					build.append("V"+count+" = " + V[row][col]);
					count++;
					if (j < V.length-1){
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
		catch(Exception err){
			System.out.println("An error occured");
			err.printStackTrace();
		}
	}
}