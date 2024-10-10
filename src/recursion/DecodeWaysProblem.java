package recursion;

public class DecodeWaysProblem {
    public static void main(String[] args) {
        String s = "10";

        int res = DecodeWays(s, s.length() - 1);
        System.out.println(res);
    }

    public static int DecodeWays(String str, int idx) {
        if (idx <= 0) {
            return 1;
        }
        int res = 0;
        if (str.charAt(idx) != '0') {
            res = DecodeWays(str, idx - 1);
        }

        if (str.charAt(idx - 1) == '1' || str.charAt(idx - 1) == '2' && str.charAt(idx) <= 6) {
            res += DecodeWays(str, idx - 2);
        }
        return res;
    }
}
