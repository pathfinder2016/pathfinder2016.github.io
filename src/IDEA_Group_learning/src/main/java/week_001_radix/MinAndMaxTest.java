package week_001_radix;

public class MinAndMaxTest {
    public static void main(String args[]){
        short min_byte = Byte.MIN_VALUE;
        short max_byte = Byte.MAX_VALUE;
        int b = Short.MAX_VALUE+1;
        short c = Byte.MAX_VALUE+1;
        byte d = (byte)(Byte.MAX_VALUE+1);

        System.out.println(b); //32767 + 1 = 32768
        System.out.println(c); //127 + 1 = 128
        System.out.println(d); // -128
    }

}
