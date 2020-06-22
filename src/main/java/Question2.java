import java.util.ArrayList;
import java.util.List;

public class Question2 {
    public static void main(String args[]) {
        List<String> stringList = new ArrayList<String>();
        stringList.add("abc");
        stringList.add("def");
        stringList.add("ghi");
        stringList.add("aaa");
        stringList.add("abcdef");
        stringList.add("adf");

        stringList.stream().filter(string -> string.startsWith("a") && string.length() == 3)
                .forEach(System.out::println);
    }
}
