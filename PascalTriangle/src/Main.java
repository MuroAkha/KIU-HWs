import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<Please insert number of rows:");
        System.out.print("<");
        triangle(sc.nextInt());

    }

    public static void triangle(int n) {



            int[][] pascal = new int[n][n];
            for (int i = 0; i < pascal.length; i++) {

                pascal[i][0] = 1;
                pascal[i][i] = 1;
                System.out.print("<n="+i+"\t");
                int[] pascal1 = new int[i + 1];
                for (int j = 0; j < pascal1.length; j++) {

                    if (i >= 1 && j >= 1) {
                        pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
                    }



                    System.out.print(pascal[i][j]+"\t");
                }


                System.out.println();

            }



    }

}


