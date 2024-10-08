package sortingAlgorithms;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        insertionSortAlgorithm(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSortAlgorithm(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentEl = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > currentEl) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = currentEl;
        }
    }
}
