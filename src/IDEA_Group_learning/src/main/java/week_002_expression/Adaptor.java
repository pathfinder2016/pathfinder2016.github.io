package week_002_expression;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Adaptor {

    public static void main(String[] args) {
        char[] cbuf = new char[256];
        System.out.println("hey, may I have your name, please? ");
        int n = 0;
        Reader r = new InputStreamReader(System.in); //System.in 字节
        try {
            r.read(cbuf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Hello, Mr. "+cbuf[0]+cbuf[1]+cbuf[2]);
    }
}
