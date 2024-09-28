package recursion;

public class ClimbingStairsProblem {
    public static void main(String[] args) {
        int[] cost = { 10, 15, 20 };
        System.out.println(climbingStairsProblem(0, cost));
    }

    public static int climbingStairsProblem(int idx, int[] cost) {
        if (idx >= cost.length)
            return 0;
        return cost[idx] + Math.min(climbingStairsProblem(idx + 1, cost), climbingStairsProblem(idx + 2, cost));
    }
}
