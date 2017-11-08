import java.io.*;
import java.util.*;

public class Group4b {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] alpha = new double[5][4];
		double[][] l1 = new double[5][4];
		double[][] l2 = new double[5][4];
		double[][] tetha1 = new double[5][4];
		double[][] tetha2 = new double[5][4];
		int count = 1;
		for (int row = 0; row < alpha.length; row++){
			for (int col=0; col<alpha[row].length; col++){
				System.out.print("l1_"+count+" = ");
				l1[row][col] = input.nextDouble();
				System.out.print("l2_"+count+" = ");
				l2[row][col] = input.nextDouble();
				System.out.print("tetha1_"+count+" = ");
				tetha1[row][col] = input.nextDouble();
				System.out.print("tetha2_"+count+" = ");
				tetha2[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count=1;
		for (int row=0; row<alpha.length; row++){
			for (int col = 0; col<alpha[row].length; col++) {
				alpha[row][col] = (l2[row][col] - l1[row][col]) / (l1[row][col] * (tetha2[row][col] - tetha1[row][col]));
				System.out.println("alpha "+count+" = " + alpha[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try {
			file = new FileWriter("Group4bOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for (int row = 0; row < alpha.length; row++){
				for (int col = 0; col < alpha[row].length; col++){
					build.append("alpha "+count+" = " + alpha[row][col] + "\n");
					count++;
				}
				build.append("\n");
			}
			writer.write(build.toString());
			writer.close();
		}
		catch(IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
		catch (Exception e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}