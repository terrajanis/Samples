import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;



public class FindBytes {

        public static void main(String[] args) throws Exception {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            FileInputStream inputStream = new FileInputStream(reader.readLine());

            long[] arr = new long[256];
            while (inputStream.available() > 0) {
                arr[inputStream.read()]++;
            }
            inputStream.close();

            for (int i = 0; i < 256 ; i++) {
                if (arr[i] > 2) {
                    System.out.print(i + " ");
                }
            }
        }
    }
