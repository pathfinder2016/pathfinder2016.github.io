package week_003_method_call;

public class Main {
    public static void main(String args[]) {
        int a = 1, b = 2;
        swap(a, b);
        System.out.println("a is " + a + ", b is " + b);
    }

    public static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }
}