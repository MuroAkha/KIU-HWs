package fop.w3array;

public class GamesWithArrays {

    public static int[] otherSort(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        int resultIndex = 0;


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr1[j] == arr2[i]) {
                    result[resultIndex++] = arr1[j];
                    arr1[j] = Integer.MIN_VALUE;
                }
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != Integer.MIN_VALUE) {
                result[resultIndex++] = arr1[i];
            }
        }

        return result;
    }

    public static int[] fairFriends(int[] arr, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        int max1 = arr[0];
        int max2 = arr2[0];
        for (int i = 0; i < arr.length; i++) {
            if (max1 < arr[i])
                max1 = arr[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            if (max2 < arr2[i])
                max2 = arr2[i];
        }
        for (int i = 0; i < arr.length; i++) {
            sum1 += arr[i];
            for (int j = 0; j < arr2.length; j++) {
                sum2 += arr2[j];

                if (sum1 > sum2) {
                    int temp;
                    temp = max2;
                    max2 = max1;
                    max1 = temp;

                } else if (sum1 == sum2)
                    max1 = max2;
                else {
                    int temp1;
                    temp1 = max1;
                    max1 = max2;
                    max2 = temp1;

                }
            }
        }
        return new int[]{max1, max2};
    }


    public static int[] plancton(int[] arr) {
        int buyDay = 0;
        int sellDay = 0;
        int maxProfit = 0;
        int currentMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < currentMin) {
                currentMin = arr[i];
                buyDay = i - 1;
            } else if (arr[i] - currentMin > maxProfit) {
                maxProfit = arr[i] - currentMin;
                sellDay = i - 1;
            }
        }

        if (maxProfit > 0) {
            return new int[]{buyDay + 1, sellDay + 1, maxProfit};
        } else
            return new int[]{0, 0, 0};

    }


    public static int pinguFriends(int[] arr) {

        int[] counts = new int[100];
        for (int num : arr) {
            counts[num]++;
        }

        int minCountGreaterThanOne = Integer.MAX_VALUE;
        for (int count : counts) {
            if (count > 1 && count < minCountGreaterThanOne) {
                minCountGreaterThanOne = count;
            }
        }

        if (minCountGreaterThanOne == Integer.MAX_VALUE) return 0;

        for (int count : counts) {
            if (count > 0 && (count < 2 || count % minCountGreaterThanOne != 0)) {
                return 0;
            }
        }

        return minCountGreaterThanOne;
    }

    public static boolean alps(int[] arr) {
        if (arr == null || arr.length < 3) {
            return false;
        }
        int i = 1;
        int l = arr.length;
        while (i < l && arr[i] > arr[i - 1]) {
            i++;
        }
        if (i==1 || i == l)
            return false;
        while (i < l && arr[i] < arr[i - 1]) {
            i++;
        }
        return i==l;

    }
}
