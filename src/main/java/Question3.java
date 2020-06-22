import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Question3 {
    public static void main(String args[]) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("Anna");
        stringList.add("Mom");
        stringList.add("Noon");
        stringList.add("Radar");
        stringList.add("Happy");
        stringList.add("Sad");
        stringList.add("Morning");
        stringList.add("Night");
        stringList.add("Moon");

        stringList.stream()
                .filter(Question3::isPalindrome)
                .forEach(System.out::println);
    }

    private static boolean isPalindrome(String string) {
        String stringLowerCase = string.toLowerCase();
        return IntStream.range(0, stringLowerCase.length() / 2)
                .noneMatch(i -> stringLowerCase.charAt(i) != stringLowerCase.charAt(stringLowerCase.length() - i - 1));
    }
}