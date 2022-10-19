package homeWork1;

public class ValidPalindrome {
    public static void main(String[] args) {
        String str = "abb";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().trim();
        int i = 0;
        int j = s.length() - 1;
        boolean res = false;

        if (s.isEmpty()) return true;

        while (i <= j) {

            while (Character.isLetter(s.charAt(i)) == false && Character.isDigit(s.charAt(i)) == false) {
                i++;
                if (i > s.length() - 1) return true;
            }
            while (Character.isLetter(s.charAt(j)) == false && Character.isDigit(s.charAt(j)) == false) {
                j--;
            }


            if (s.charAt(i) == s.charAt(j)) {
                res = true;
            } else {
                return false;

            }
            i++;
            j--;
        }
        return res;
    }
}
