import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        printStringReverse("Hello World");

        printSubstringReverse("Hello World", 1, 4);

        System.out.println(getWordsReverse("Hello my nice world"));

        System.out.println(getWordsReverseInColumn("Hello my nice world"));

        System.out.println(maxCharIndex("ddcccabbbb"));
    }

    /**
     * STRING REVERSE FUNCTION
     */

    public static void printStringReverse(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("Wrong string");
            return;
        }
        StringBuilder builder = new StringBuilder(str);
        String result = builder.reverse().toString();
        System.out.println(result);
    }

    /// ///////////////

    /**
     * IS PHONE NUMBER
     */

    public static Boolean isPhoneNumber(String number) {
        if (number == null || number.isEmpty() || number.trim().isEmpty())
            return null;

        if (number.charAt(0) == '8'
                && number.length() == 11
                && number.matches("\\d+")) {
            return true;
        } else {
            return false;
        }
    }

    /// ///////////////

    /**
     * BY INDEX REVERSE
     */

    public static void printSubstringReverse(String str, int start, int finish) {
        if (str == null || str.trim().isEmpty()
                || start < 0 || finish < 0 || finish >= str.length() || start > finish) {
            System.out.println("Wrong args");
        }

        String subStr = str.substring(1, 5); // "ello"
        StringBuilder builder = new StringBuilder(subStr);
        String reversedStr = builder.reverse().toString();

        String h = str.substring(0, start); // "H"
        String lastPart = str.substring(finish + 1); // " World"

        String finalStr = h + reversedStr + lastPart;

        System.out.println(finalStr);
    }

    /// ///////////////

    /**
     * REVERSE BY WORDS
     */

    public static String getWordsReverse(String str) {
        if (Objects.isNull(str) || str.isBlank())  return null;

//        return Arrays.stream(str.split(" "))
//                .collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
//                    Collections.reverse(list);
//                    return String.join(" ", list);
//                }));

        return String.join(" ", Arrays.asList(str.split(" ")).reversed());
    }

    /// ///////////////

    /**
     * REVERSE BY WORDS (в столбик)
     */

    public static String getWordsReverseInColumn(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("Wrong string");
        }

        return Arrays.stream(str.split(" "))
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
//                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(System.lineSeparator()));
    }

    /// ///////////////

    /**
     * MAX CHAR INDEX
     */

    public static int maxCharIndex(String str) {
        if (str == null || str.trim().isEmpty()) {
            return -1;
        }

        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }


        int maxFrequency = 0;
        for (int frequency : charCount.values()) { /// /////////////////// STREAM API !!!!!!!!!!!!!!!!!!!
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }


        for (int i = 0; i < str.length(); i++) {
            if (charCount.get(str.charAt(i)) == maxFrequency) {
                return i;
            }
        }

        return -1;
    }
}
