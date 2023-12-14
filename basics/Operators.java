class Operators {
    public static void main(String[] args) {
        /**
         * arithmetic operators => +, -, *, /, %
         * assignment operators => =, +=, -=, *=, /=, %=, &=, |=, ^=, <<=, >>=, >>>=
         * relational operators => ==, !=, >, <, >=, <=
         * logical operators => &&, ||, !
         * bitwise operators => &, |, ^, ~, <<, >>, >>>
         * unary operators => +, -, ++, --, !
         * ternary operator => ?:
         * dot operator => .
         * instanceof operator => instanceof
         */

        int a = 127;
        int b = 12;

        int c = a / b;
        System.out.println(c); // 10 ?

        float d = a / b;
        System.out.println(d); // 10.0 ?

        float e = (float) a / b;
        System.out.println(e); // 10.583333 ?

        int p = 10;
        System.out.println(p); // 10
        System.out.println(p++); // 10
        System.out.println(p); // 11

        int q = 20;
        System.out.println(q); // 20
        System.out.println(++q); // 21
        System.out.println(q); // 21

        System.out.println(1 & 1); // 1 ?
        System.out.println(1 | 1); // 1 ?
        System.out.println(1 ^ 1); // 0 ?
        System.out.println(~1); // -2 ?

        System.out.println(3 & 2); // 2 ?
        System.out.println(3 | 2); // 3 ?
        System.out.println(3 ^ 2); // 1 ?
        System.out.println(~2); // -3 ?
    }
}
