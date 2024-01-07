public class StringExample {
    public static void main(String[] args) {
        String str = "Hello world...!";

        System.out.println(str);

        System.out.println(str.length());

        System.out.println(str.charAt(1));

        System.out.println(str.substring(1, 5));    // 1 to 4 (excluding 5)

        System.out.println(str.indexOf("world"));

        System.out.println(str.replace("world", "Java"));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        System.out.println(str.trim());     // remove leading and trailing spaces

        System.out.println(str.equals("Hello world...!"));
        System.out.println(str.equalsIgnoreCase("hello world...!"));

        System.out.println(str.concat(" Welcome to Java"));
        System.out.println(str + " Welcome to Java" + " ^_^");

        System.out.println(str.isEmpty());
    }
}
