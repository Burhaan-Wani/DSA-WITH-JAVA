package recursion;

public class HouseRobberProblem {
    public static void main(String[] args) {
        int[] cost = { 2, 7, 9, 3, 1 };
        System.out.println(houseRobberProblem(0, cost));
    }

    public static int houseRobberProblem(int idx, int[] cost) {
        if (idx >= cost.length)
            return 0;

        int rob = cost[idx] + houseRobberProblem(idx + 2, cost);
        int dontRob = houseRobberProblem(idx + 1, cost);
        return Math.max(rob, dontRob);
    }
}
