import java.io.*;
import java.util.*;

public class Group4b {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group4bOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		double[][] H = new double[5][4];
		double[][] O = new double[5][4];
		double[][] A = new double[5][4];

		int count = 1;
		System.out.println("Enter values for O and A");
		for (int row = 0; row < H.length; row++){
			for (int col = 0; col < H[row].length; col++){
				System.out.print("O" + count + " = ");
				O[row][col] = input.nextDouble();
				System.out.print("A" + count + " = ");
				A[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}

		count = 1;
		for (int row = 0; row < H.length; row++){
			for (int col = 0; col < H[row].length; col++){
				H[row][col] = Math.sqrt(Math.pow(O[row][col], 2) + Math.pow(A[row][col], 2));
				System.out.println("H^2_" + count + " = " + Math.pow(H[row][col], 2));
				count++;
			}
			System.out.println();
		}

		count = 1;
		try {
			for (int row = 0; row < H.length; row++){
				for (int col = 0; col < H[row].length; col++){
					builder.append("H^2_" + count + " = " + Math.pow(H[row][col], 2));
					count++;
					if (col < H.length-1){
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