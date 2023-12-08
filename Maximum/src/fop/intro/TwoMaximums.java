package fop.intro;

import java.util.Scanner;

public class TwoMaximums extends MiniJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please indicate number:");
        int k = sc.nextInt();
        int[] arr = new int[k];

        int firstMax = Integer.MIN_VALUE; // we create this variable to find MAX_INT in arr
        int secondMax = Integer.MIN_VALUE; //we create this variable to find second MAX_INT in arr

        if (k < 2) {
            System.out.println("Error: number >= 2 expected!");
            return;
        }
        for (int i = 0; i < k; i++) {
            // placing given integers in array
            System.out.println("Please insert integer:");
            int num = sc.nextInt();

            // finds maxes
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num < firstMax) {
                secondMax = num;
            }


        }
        System.out.println(firstMax);
        System.out.println(secondMax);
    }

}
