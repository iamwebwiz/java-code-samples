
import java.util.*;
import java.io.*;

public class Group2c {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		FileWriter fwriter = new FileWriter("Group2cOutput.txt");
		BufferedWriter bwriter = new BufferedWriter(fwriter);
		StringBuilder builder = new StringBuilder();

		int[][] a = new int[5][4];
		int count = 1;
		System.out.println("Enter values for a");
		for (int row=0; row<a.length; row++){
            for (int col=0; col<a[row].length; col++){
                System.out.println("Values are being fetched...");
                // System.out.print("a"+(count)+": ");
                // a[row][col] = scan.nextInt();
                a[row][col] = (int)(Math.random()*100);
                count++;
            }
        }

        count = 1;

        int[][] b = new int[5][4];
        System.out.println("Enter values for b");
        for (int row=0; row<b.length; row++){
            for (int col=0; col<b[row].length; col++){
                System.out.println("Values are being fetched...");
                // System.out.print("b"+(count)+": ");
                // b[row][col] = scan.nextInt();
                b[row][col] = (int)(Math.random()*100);
                count++;
            }
        }

        count = 1;

        int[][] c = new int[5][4];
        System.out.println("Enter values for c");
        for (int row=0; row<c.length; row++){
            for (int col=0; col<c[row].length; col++){
                System.out.println("Values are being fetched...");
                // System.out.print("c"+(count)+": ");
                // c[row][col] = scan.nextInt();
                c[row][col] = (int)(Math.random()*100);
                count++;
            }
        }

        count = 1;

        int[][] s = new int[5][4];
        System.out.println("Enter values for s");
        for (int row=0; row<s.length; row++){
            for (int col=0; col<s[row].length; col++){
                System.out.println("Values are being fetched...");
                // System.out.print("s"+(count)+": ");
                // s[row][col] = scan.nextInt();
                s[row][col] = (int)(Math.random()*100);
                count++;
            }
        }

        int[][] diff1 = new int[5][4];
        int[][] diff2 = new int[5][4];
        int[][] diff3 = new int[5][4];
        int[][] products = new int[5][4];

        for (int row=0; row<a.length; row++){
        	for (int col = 0; col<a[row].length; col++){
        		diff1[row][col] = s[row][col] - a[row][col];
        		diff2[row][col] = s[row][col] - b[row][col];
        		diff3[row][col] = s[row][col] - c[row][col];
        	}
        }

        double[][] A = new double[5][4];
        count = 1;

        for (int row=0; row<a.length; row++){
        	for (int col=0; col<a[row].length; col++){
        		products[row][col] = s[row][col] * (diff1[row][col] * diff2[row][col] * diff3[row][col]);
        		A[row][col] = Math.sqrt(products[row][col]);
        		System.out.println("A"+(count)+ ": " + A[row][col] + " ");
        		count++;
        	}
        	System.out.println();
        }

        count = 1;
        try {
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
            bwriter.write(builder.toString());
            bwriter.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
	}
}
