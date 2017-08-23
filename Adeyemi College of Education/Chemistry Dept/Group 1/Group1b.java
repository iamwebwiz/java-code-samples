
import java.util.*;
import java.io.*;

public class Group1b {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] a = new int[5][4];
		double[][] b = new int[5][4];
		double[][] c = new int[5][4];
		double[][] k = new int[5][4];
		double[][] X = new int[5][4];
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
				//
			}
		}
	}
}
