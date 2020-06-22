import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class Question1 {
    public static void main(String args[]) {
        IntStream stream = IntStream.of(17, 29, 37, 40, 57, 18, 29, 108, 273, 182, 719);
        OptionalDouble streamObject = stream.average();
        if (streamObject.isPresent()) {
            System.out.println(streamObject.getAsDouble());
        } else {
            System.out.println(-1);
        }
    }
}