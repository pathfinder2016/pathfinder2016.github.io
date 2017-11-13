package week_002_expression;

import java.io.IOException;

public class Interaction {
    public static void main(String[] args) {
        byte[] buf = new byte[512];
        System.out.println("hey, may I have your name, please? ");
        int n = 0;
        try {
            n = System.in.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("hello, ");
        System.out.write(buf, 0, n);
    }
}
