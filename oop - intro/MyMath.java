public class MyMath {
    // static attributes and static methods

    public static final double PI = 3.14;

    public static int absolute(int a) {
        if(a < 0) {
            return -a;
        }

        return a;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return add(a, -b);
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if(b == 0) {
            return 0;
        }

        return (double)a / b;
    }

    public static int max(int a, int b) {
        if(a > b) {
            return a;
        }

        return b;
    }

    public static int min(int a, int b) {
        if(a < b) {
            return a;
        }

        return b;
    }
}
