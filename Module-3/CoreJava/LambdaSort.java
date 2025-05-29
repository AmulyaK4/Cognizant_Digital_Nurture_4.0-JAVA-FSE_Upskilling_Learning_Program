import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai", "Kolkata");

        Collections.sort(cities, (c1, c2) -> c1.compareTo(c2));
        System.out.println("Sorted cities: " + cities);
    }
}

