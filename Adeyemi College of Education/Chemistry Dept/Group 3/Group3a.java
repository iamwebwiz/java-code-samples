import java.io.*;
import java.util.*;

public class Group3a {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;

		double[][] u = new double[5][4];
		double[][] t = new double[5][4];
		double[][] a = new double[5][4];
		double[][] S = new double[5][4];

		int count = 1;
		for (int row = 0; row < S.length; row++){
			for (int col=0; col<S[row].length; col++){
				System.out.print("u"+count+" = ");
				u[row][col] = input.nextDouble();
				System.out.print("a"+count+" = ");
				a[row][col] = input.nextDouble();
				System.out.print("t"+count+" = ");
				t[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}

		count = 1;
		for(int row=0; row<S.length; row++){
			for(int col = 0; col <S[row].length; col++){
				S[row][col] = (u[row][col] * t[row][col]) + ((a[row][col] * Math.pow(t[row][col], 2)) / 2);
				System.out.println("S" + count + " = " + S[row][col]);
				count++;
			}
			System.out.println();
		}

		count=1;
		try {
			file = new FileWriter("Group3aOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for(int row=0; row<S.length; row++){
				for(int col=0; col<S[row].length; col++){
					builder.append("S" + count + " = " + S[row][col]);
					count++;
					if(col<S.length-1){
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
