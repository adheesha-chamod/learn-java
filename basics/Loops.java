public class Loops {
    public static void main(String[] args) {
        int a = 0, b = 0, c;
        int limit = 5;
        
        // while loop
        while (a < limit) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();

        // do-while loop
        do {
            System.out.print(b + " ");
            b++;
        } while (b < limit);
        System.out.println();

        // for loop
        for (c = 0; c < limit; c++) {
            System.out.print(c + " ");
        }
        System.out.println();

        // break
        int i = 0;
        while (i < 10) {
            if (i == 8) {
                break;
            }
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // continue
        int j = 0;
        while (j < 10) {
            if (j == 8) {
                j++; // Increment j here to avoid an infinite loop
                continue;
            }
            System.out.print(j + " ");
            j++;
        }
        System.out.println();

        // for-each loop
        int[] arr = {10, 20, 30, 40, 50};
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        String[] names = {"John", "Saman", "Doe", "Alex"};
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
    }
}
