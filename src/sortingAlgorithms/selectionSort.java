package sortingAlgorithms;

public class selectionSort {

    public static void main(String[] args) {
        int[] arr = { 13, -1, 4, 6, 7, 9, 14 };
        for (int i = 0; i < arr.length; i++) { // here we are trying to search the min value from the array
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // add the min value element at the end of the sorted array (swap)
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // print elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
