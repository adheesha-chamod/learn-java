public class Arrays {
    public static void main (String[] args) {
        int[] array1;           // create references to an array of int
        array1 = new int[10];   // create the array object and assign the created references

        array1[0] = 10;
        array1[1] = 20;

        System.out.println("array1[0]: " + array1[0]);
        System.out.println("array1[1]: " + array1[1]);

        System.out.println("array1:" + array1);     // prints the reference to the array object


        String[] array2 = {"Hello", "World", "Nic", "Adheesha", "X-Venture"};
        System.out.println("array2[0]: " + array2[0]);
        System.out.println("array2[1]: " + array2[1]);

        System.out.println("array2: " + array2);

        System.out.println("Length of array2: " + array2.length);
    }
}
