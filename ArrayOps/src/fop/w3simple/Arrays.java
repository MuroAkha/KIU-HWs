package fop.w3simple;

public class Arrays extends MiniJava {
    public static void print(int[] arr) {
        StringBuilder text = new StringBuilder("{");
        for (int i = 0; i < arr.length; i++) {
            text.append(arr[i]);
            if (i < arr.length - 1) {
                text.append(", ");
            }
        }
        text.append("}");
        writeConsole(text.toString());

    }

    public static void minAndMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        writeConsole("Minimum = " + min + ", Maximum = " + max);

    }

    public static int[] invert(int[] arr) {
        int[] inverted = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            inverted[i] = arr[arr.length - i - 1];
        }
        return inverted;
    }

    public static int[] cut(int[] arr, int len) {
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            if (i < arr.length) {
                newArray[i] = arr[i];
            } else {
                newArray[i] = 0;
            }
        }
        return newArray;
    }

    public static int[] linearize(int[][] arr) {
        int totalElements = 0;
        for (int i = 0; i < arr.length; i++) {
            totalElements += arr[i].length;
        }
        int[] newArray = new int[totalElements];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[i].length; a++) {
                newArray[index] = arr[i][a];
                index++;
            }
        }
        return newArray;
    }
}
