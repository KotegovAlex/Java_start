package homeWork1;

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String s) {
        s = s.trim();
        int endI = 0;
        int startI = 0;
        int i = s.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (i >= 0) {

            if (s.charAt(i) != ' ') {
                endI = i;

                if (endI == 0) {
                    sb.append(s.charAt(0));
                    break;
                } else {
                    while (s.charAt(i) != ' ' && i != 0) {
                        i--;
                    }
                    startI = i;

                }
                sb.append(s.substring(startI, endI + 1).trim() + ' ');
                if (i == 0) break;
            } else {
                i--;
            }
        }
        return sb.toString().trim();
    }
}
