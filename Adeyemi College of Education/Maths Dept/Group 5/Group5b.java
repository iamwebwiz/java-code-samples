import java.util.*;
import java.io.*;

public class Group5b {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		FileWriter file = null;
		BufferedWriter writer = null;
		StringBuilder builder = null;
		int[][] a = new int[5][4];
		int count = 1;
		System.out.println("Enter values for a");
		for (int row=0; row<a.length; row++){
            for (int col=0; col<a[row].length; col++){
                System.out.print("a"+(count)+": ");
                a[row][col] = scan.nextInt();
                count++;
            }
        }
        count = 1;
        int[][] b = new int[5][4];
        System.out.println("Enter values for b");
        for (int row=0; row<b.length; row++){
            for (int col=0; col<b[row].length; col++){
                System.out.print("b"+(count)+": ");
                b[row][col] = scan.nextInt();
                count++;
            }
        }
        count = 1;
        int[][] c = new int[5][4];
        System.out.println("Enter values for c");
        for (int row=0; row<c.length; row++){
            for (int col=0; col<c[row].length; col++){
                System.out.print("c"+(count)+": ");
                c[row][col] = scan.nextInt();
                count++;
            }
        }
        count = 1;
        int[][] k = new int[5][4];
        System.out.println("Enter values for k");
        for (int row=0; row<k.length; row++){
            for (int col=0; col<k[row].length; col++){
                System.out.print("k"+(count)+": ");
                k[row][col] = scan.nextInt();
                count++;
            }
        }
        int[][] diff1 = new int[5][4];
        int[][] diff2 = new int[5][4];
        int[][] diff3 = new int[5][4];
        int[][] products = new int[5][4];
        for (int row=0; row<a.length; row++){
        	for (int col = 0; col<a[row].length; col++){
        		diff1[row][col] = k[row][col] - a[row][col];
        		diff2[row][col] = k[row][col] - b[row][col];
        		diff3[row][col] = k[row][col] - c[row][col];
        	}
        }
        double[][] A = new double[5][4];
        count = 1;
        for (int row=0; row<a.length; row++){
        	for (int col=0; col<a[row].length; col++){
        		products[row][col] = k[row][col] * (diff1[row][col] * diff2[row][col] * diff3[row][col]);
        		A[row][col] = Math.sqrt(products[row][col]);
        		System.out.println("A"+(count)+ ": " + A[row][col] + " ");
        		count++;
        	}
        	System.out.println();
        }
        count = 1;
        try {
        	file = new FileWriter("Group5bOutput.txt");
        	writer = new BufferedWriter(file);
        	builder = new StringBuilder();
            for (int row=0; row<a.length; row++){
                for (int col=0; col<a[row].length; col++){
                    builder.append("A" + (count) + ": " + A[row][col] + " ");
                    count++;
                    if (col < a.length-1){
                        builder.append("\n");
                    }
                }
                builder.append("\n");
            }
            writer.write(builder.toString());
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
	}
}
