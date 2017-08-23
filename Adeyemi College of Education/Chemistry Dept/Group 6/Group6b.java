import java.util.*;
import java.io.*;

public class Group6b {
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);

        FileWriter fwriter = new FileWriter("Group6bOutput.txt");
        BufferedWriter bwriter = new BufferedWriter(fwriter);
        StringBuilder builder = new StringBuilder();

        double[][] u = new double[5][4];
        int count = 1;
        System.out.println("Enter values for u");
        for (int row=0; row<u.length; row++){
            for (int col=0; col<u[row].length; col++){
                System.out.print("u"+(count)+": ");
                u[row][col] = scan.nextDouble();
                count++;
            }
        }

        count = 1;
        double[][] tetha = new double[5][4];
        System.out.println("Enter values for tetha");
        for (int row = 0; row < tetha.length; row++){
            for (int col = 0; col < tetha[row].length; col++){
                System.out.print("tetha"+(count)+": ");
                tetha[row][col] = scan.nextDouble();
                count++;
            }
        }

        System.out.print("Value for g: ");
        double g = scan.nextDouble();
        double[][] R= new double[5][4];
        double[][] numerator = new double[5][4];
        for (int row = 0; row < u.length; row++){
            for (int col = 0; col < u[row].length; col++){
                numerator[row][col] = Math.pow(u[row][col], 2) * Math.sin(2 * tetha[row][col]);
            }
        }

        count = 1;

        for (int i = 0; i < u.length; i++){
            for (int j=0; j<u[i].length; j++){
                R[i][j] = numerator[i][j] / g;
                System.out.println("R"+(count)+": "+R[i][j] + " ");
                count++;
            }
            System.out.println();
        }

        count = 1;
        try {
            for (int row=0; row<u.length; row++){
                for (int col=0; col<u[row].length; col++){
                    builder.append("R" + (count) + ": " +R[row][col] + " ");
                    count++;
                    if (col < u.length-1){
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
