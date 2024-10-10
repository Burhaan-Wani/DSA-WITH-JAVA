package recursion;

import java.util.ArrayList;

public class SubsetOfArraysProblem {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();

        int[] arr = { 1, 2, 3 };
        subsetOfArraysProblem(0, arr, res, curr);

        System.out.println(res);
    }

    public static void subsetOfArraysProblem(int idx, int[] arr, ArrayList<ArrayList<Integer>> res,
            ArrayList<Integer> curr) {

        if (idx == arr.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        // include
        curr.add(arr[idx]);
        subsetOfArraysProblem(idx + 1, arr, res, curr);

        // dont include
        curr.remove(curr.size() - 1);
        subsetOfArraysProblem(idx + 1, arr, res, curr);
    }
}
