public class FlowControl {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        if(a > b)
            System.out.println("a is greater than b - 1");
        System.out.println("This line will execute - 1");

        // ternary operator
        String ans =  (a > b) ? "a is greater than b - 2" : "b is greater than a - 2";
        System.out.println(ans);

        // switch
        char ch = 'i';

        switch(ch) {
            case 'a':
                System.out.println("Vowel - a");
                break;
            case 'e':
                System.out.println("Vowel - e");
                break;
        }
    }
}
