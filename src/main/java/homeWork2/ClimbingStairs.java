package homeWork2;

import java.util.ArrayList;
import java.util.List;

public class ClimbingStairs {
    public static void main(String[] args) {
        for (int i = 0; i < 45; i++) arr.add(0);
        System.out.println(climbStairs(45));
    }

    public static List<Integer> arr = new ArrayList<>(45);

    public static int climbStairs(int n) {

        int res;
        if (n <= 3) {
            res = n;
        } else if (ClimbingStairs.arr.get(n - 1) != 0) {
            return arr.get(n - 1);
        } else {
            res = climbStairs(n - 1) + climbStairs(n - 2);
        }
        arr.set(n - 1, res);
        return res;
    }
}
