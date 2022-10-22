package homeWork2;

public class Pow {
    public static void main(String[] args) {
        int n = 2147483647;
        double x = 0.00001;
        System.out.println(myPow(x, n));
    }

    public static double myPow(double x, int n) {
        if (x == 0) return 0;
        if (n == 0) return 1;

        double half = myPow(x, n / 2);
        return (n % 2 == 0) ? (half * half) : (n % 2 == 1 ? x * half * half : 1/myPow(x, -n));
    }
}
