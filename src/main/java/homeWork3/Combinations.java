package homeWork3;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static List<List<Integer>> resList = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(combine(9, 2));
    }

    private static void backTrack(int n, int k, int mainNumber) {
        if (k == 0) {
            resList.add(new ArrayList<>(list));
            return;
        }
        for (int i = mainNumber; i <= n - k + 1; i++) {
            list.add(i);
            backTrack(n, k - 1, i + 1);
            list.remove(list.size() - 1);
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        backTrack(n, k, 1);
        return resList;
    }
}
