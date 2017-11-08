import java.util.*;
import java.io.*;

public class Group8a {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder build = null;
		double[][] p = new double[5][4];
		double[][] r = new double[5][4];
		double[][] n = new double[5][4];
		double[][] F = new double[5][4];
		int count = 1;
		for (int row=0; row<F.length; row++){
			for (int col=0; col<F[row].length; col++){
				System.out.print("p"+ count + " = ");
				p[row][col] = input.nextDouble();
				System.out.print("r"+ count + " = ");
				r[row][col] = input.nextDouble();
				System.out.print("n"+ count + " = ");
				n[row][col] = input.nextDouble();
				System.out.println();
				count++;
			}
		}
		count=1;
		for (int row=0; row<F.length; row++){
			for (int col=0; col<F[row].length; col++){
				F[row][col] = p[row][col] * Math.pow((100+r[row][col])/100,n[row][col]);
				System.out.println("F"+count+" = "+F[row][col]);
				count++;
			}
			System.out.println();
		}
		count=1;
		try {
			file = new FileWriter("Group8aOutput.txt");
			writer = new BufferedWriter(file);
			build = new StringBuilder();
			for(int row=0; row<F.length; row++){
				for (int col=0; col<F[row].length; col++){
					build.append("F"+count+" = "+F[row][col]);
					count++;
					if (col<F.length-1){
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
