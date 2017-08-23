import java.util.*;
import java.io.*;

public class Group1b {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] a = new double[5][4];
		double[][] b = new double[5][4];
		double[][] c = new double[5][4];
		double[][] k = new double[5][4];
		double[][] X = new double[5][4];
		int count = 1;
		for (int row=0; row<X.length; row++){
			for (int col=0; col<X[row].length; col++){
				System.out.print("a"+ count + " = ");
				a[row][col] = input.nextDouble();
				System.out.print("b"+ count + " = ");
				b[row][col] = input.nextDouble();
				System.out.print("c"+ count + " = ");
				c[row][col] = input.nextDouble();
				System.out.print("k"+ count + " = ");
				k[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count=1;
		for (int row=0; row<X.length; row++){
			for (int col=0; col<X[row].length; col++){
				X[row][col] = Math.sqrt(k[row][col] * (k[row][col]-a[row][col]) * (k[row][col]-b[row][col]) * (k[row][col]-c[row][col]));
				System.out.println("X"+count+" = "+X[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try {
			file = new FileWriter("Group1bOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for(int row=0; row<X.length; row++){
				for (int col=0; col<X[row].length; col++){
					build.append("X"+count+" = "+X[row][col]);
					count++;
					if (col<X.length-1){
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
