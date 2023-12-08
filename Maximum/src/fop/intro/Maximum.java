package fop.intro;
import java.util.Scanner;
public class Maximum extends MiniJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate number:");
        int k = sc.nextInt();
        int[] arr = new int[k];

        int firstMax = Integer.MIN_VALUE; // we create this variable to find MAX_INT in arr

        if (k < 1) {
            System.out.println("Error: number >= 1 expected!");
            return;
        }

        for (int i = 0; i < k; i++) {
                // placing given integers in array
                System.out.println("Please insert integer:");
                arr[i] = sc.nextInt();

            //finds max int
            if (firstMax <= arr[i]) {
                firstMax = arr[i];

            }

        }
        System.out.println(firstMax);

    }
}
