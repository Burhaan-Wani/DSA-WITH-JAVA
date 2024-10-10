package sortingAlgorithms;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        fn(arr); // function to find the kth element in an array.
        bubbleSortAlgorithm(arr); // Actual bubble sort algorithm.
        System.out.println(arr[arr.length - 2]);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSortAlgorithm(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Optimized version of bubble sort
    public static void bubbleSortAlgo(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false; // This variable keeps track of whether the array is sorted or not. If the
                                     // variable remains false which means that the array is already sorted.
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                return;
            }
        }
    }

    // Find the kth element in a sorted array
    public static void fn(int[] arr) {
        // 3,1,2,4
        for (int i = 0; i < arr.length - 1; i++) {
            boolean sec = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (i > 1) {
                    sec = true;
                    break;
                } else if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (sec == true) {
                break;
            }
        }
    }
}
