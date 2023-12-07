public class Primitives {
    public static void main (String[] args) {
        // primitive data types

        // variables
        boolean bool = true;
        byte b = 12;
        short s = 100;
        int i = 1043;
        long l = 1012356987;
        float f = 1.23f;
        double d = 1.23423424;
        char c = 'a';
        String str = "Hello World!";

        System.out.println("bool: " + bool);
        System.out.println("b: " + b);
        System.out.println("s: " + s);
        System.out.println("i: " + i);
        System.out.println("l: " + l);
        System.out.println("f: " + f);
        System.out.println("d: " + d);
        System.out.println("c: " + c);
        System.out.println("str: " + str);

        System.out.print("----------------------------------\n");


        // constants
        final int FIXED_NUM = 100;
        System.out.println("FIXED_NUM: " + FIXED_NUM);

        System.out.println("----------------------------------\n");


        // max and min values
        System.out.println("Min value of byte: " + Byte.MIN_VALUE);
        System.out.println("Max value of byte: " + Byte.MAX_VALUE);
        
        System.out.println("Min value of short: " + Short.MIN_VALUE);
        System.out.println("Max value of short: " + Short.MAX_VALUE);

        System.out.println("Min value of int: " + Integer.MIN_VALUE);
        System.out.println("Max value of int: " + Integer.MAX_VALUE);

        System.out.println("Min value of long: " + Long.MIN_VALUE);
        System.out.println("Max value of long: " + Long.MAX_VALUE);

        System.out.println("Min value of float: " + Float.MIN_VALUE);
        System.out.println("Max value of float: " + Float.MAX_VALUE);

        System.out.println("Min value of double: " + Double.MIN_VALUE);
        System.out.println("Max value of double: " + Double.MAX_VALUE);
    }
}
