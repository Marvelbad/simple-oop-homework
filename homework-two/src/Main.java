public class Main {
    public static void main(String[] args) {
        printStringReverse("Hello World");
    }

    public static void printStringReverse(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("Wrong string");
            return;
        }

        StringBuilder builder = new StringBuilder(str);
        String result = builder.reverse().toString();
        System.out.println(result);
    }
}
