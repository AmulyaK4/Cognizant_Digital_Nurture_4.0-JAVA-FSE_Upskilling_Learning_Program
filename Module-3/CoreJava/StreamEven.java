import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEven {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(11, 14, 17, 20, 23, 26, 29, 32);

        List<Integer> evenList = values.stream()
                                       .filter(x -> x % 2 == 0)
                                       .collect(Collectors.toList());

        System.out.println("Filtered even numbers: " + evenList);
    }
}

