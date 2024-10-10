package sortingAlgorithms;

public class mergeSort {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 7, 9 };
        int[] b = { 2, 4, 6, 8 };
        int[] res = merge(a, b);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    // merge two sorted arrays
    public static int[] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] result = new int[n + m];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                result[k++] = a[i++];
            }
            if (b[j] < a[i]) {
                result[k++] = b[j++];
            }
        }

        // if b is exausted
        while (i < n) {
            result[k++] = a[i++];
        }

        // if a is exausted
        while (j < m) {
            result[k++] = b[j++];
        }
        return result;
    }
}
