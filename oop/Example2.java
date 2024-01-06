public class Example2 {
    public static void main(String[] args) {
        System.out.println(MyMath.PI + "\n");

        int a = 5;
        int b = 3;
        int c = -12;

        System.out.println(MyMath.absolute(c));
        System.out.println(MyMath.add(a, b));
        System.out.println(MyMath.subtract(a, b));
        System.out.println(MyMath.multiply(a, b));
        System.out.println(MyMath.divide(a, b));

        System.out.println(MyMath.max(a, b));
        System.out.println(MyMath.min(b, c));
    }
}
