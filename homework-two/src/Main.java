import java.util.HashMap;
import java.util.Map;

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
        if (str == null || str.isEmpty() || str.trim().isEmpty())
            return null;

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            String txt = words[i];
            result.append(txt).append(" ");
        }
        return result.toString().trim();
    }

    /// ///////////////

    /**
     * REVERSE BY WORDS (в столбик)
     */

    public static String getWordsReverseInColumn(String str) {
        if (str == null || str.isEmpty() || str.trim().isEmpty()) {
            System.out.println("Wrong string");
        }

        assert str != null;
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder builder = new StringBuilder(word);
            result.append(builder.reverse().toString()).append("\n");
        }
        return result.toString().trim();
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

        // Определяю максимальное количество вхождений
        int maxFrequency = 0;
        for (int frequency : charCount.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // Находим индекс первого символа с максимальной частотой
        for (int i = 0; i < str.length(); i++) {
            if (charCount.get(str.charAt(i)) == maxFrequency) {
                return i;  // символ с максимальной частотой
            }
        }

        return -1;
    }
}
