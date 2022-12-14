package homeWork3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumNumbers {
    public static List<List<Integer>> resList = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();
    public static List<Integer> indexList = new ArrayList<>();
    public static Character[] temp;

    public static void main(String[] args) {
        String str = " 5? +  2? =  74 ";
        System.out.println(combine(inputData(str)));
    }

    // Преобразование входной строки
    private static int inputData(String str) {
        String inputString = str.replace(" ", "");
        temp = new Character[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            temp[i] = inputString.charAt(i);
            if (inputString.charAt(i) == '?') indexList.add(i);
        }
        System.out.println(Arrays.toString(temp));
        return indexList.size();
    }
    // Проверка исходного выражения
    private static boolean verificationExpr() {
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            if (j < list.size() && i == indexList.get(j)) {
                sb.append((int) list.get(j));
                j++;
            } else if (temp[i] == '+') {
                sb.append("=");
            } else {
                sb.append(temp[i]);
            }
        }
        String[] resStr = sb.toString().split("=");

        return Integer.parseInt(resStr[0]) + Integer.parseInt(resStr[1]) == Integer.parseInt(resStr[2]);
    }

    private static void backTrack(int k) {
        if (k == 0) {
            if (verificationExpr()) {
                resList.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = 0; i <= 9; i++) {
            list.add(i);
            backTrack(k - 1);
            list.remove(list.size() - 1);
        }
    }

    public static List<List<Integer>> combine(int k) {
        backTrack(k);
        return resList;
    }
}
