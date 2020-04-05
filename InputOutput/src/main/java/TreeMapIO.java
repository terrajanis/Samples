import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;

public class TreeMapIO {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());

        java.util.TreeMap<Integer, Integer> map = new java.util.TreeMap<>();

        while (inputStream.available() > 0) {
            int read = inputStream.read();
            map.put(read, 0);
        }

        reader.close();
        inputStream.close();

        for (Map.Entry<Integer, Integer> pair : map.entrySet())
        {

            System.out.print(pair.getKey() + " ");
        }

    }
}
