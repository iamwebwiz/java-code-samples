import java.io.*;
import java.util.*;

public class Group3c {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter fw = new FileWriter("Group3cOutput.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuilder builder = new StringBuilder();

		double[][] m = new double[5][4];
		double[][] V = new double[5][4];
		double[][] KE = new double[5][4];

		int count = 1;
		// collect values for m and V
		System.out.println("Enter values for m and V");
		for (int row = 0; row < KE.length; row++){
			for (int col = 0; col < KE[row].length; col++){
				System.out.print("m_" + count + " = ");
				m[row][col] = input.nextDouble();
				System.out.print("V_"+count+" = ");
				V[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}

		// find the Kinetic Energy and display the values
		count = 1;
		for (int row = 0; row < KE.length; row++){
			for (int col = 0; col < KE[row].length; col++){
				KE[row][col] = (m[row][col] * Math.pow(V[row][col], 2)) / 2;
				System.out.println("KE_" + count + " = " + KE[row][col]);
				count++;
			}
			System.out.println();
		}

		// write data to file
		count = 1;
		try {
			for (int row = 0; row < KE.length; row++){
				for (int col = 0; col < KE[row].length; col++){
					builder.append("KE_" + count + " = " + KE[row][col]);
					count++;
					if (col < KE.length-1){
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
