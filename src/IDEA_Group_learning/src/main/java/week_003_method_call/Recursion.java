package week_003_method_call;

public class Recursion {
    public static void main(String args[]) {
        int n = 10;
        int t = fact(n);
        System.out.println(t);
    }

    private static int fact(int n) {
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }
}