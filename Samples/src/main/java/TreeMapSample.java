import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapSample {

    public static void main(String[] args) throws Exception {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};

        String[] keys = {"A51", "A4", "A48", "A1", "A11", "A5", "A10"};

        SortedMap<String, Integer> map = new TreeMap<>();

        for (int i = 0; i < numbers.length; i++) {
            map.put(keys[i], numbers[i]);
        }

        for (Map.Entry<String, Integer> entry: map.entrySet()) {

            System.out.println(entry);

        }

    }
}
