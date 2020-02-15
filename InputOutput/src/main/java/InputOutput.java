import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class InputOutput {

    public static void main(String[] args) throws IOException {

        List<Integer>  digits = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int digit = Integer.parseInt(reader.readLine());
            digits.add(digit);
        }

        ArrayList<Integer> even = new ArrayList<Integer>();
        ArrayList<Integer> odd = new ArrayList<Integer>();

        for (int i = 0; i < digits.size(); i++)
        {
            Integer digit = digits.get(i);
            if (digit % 2 == 0)
                even.add(digit);
            else
                odd.add(digit);
        }
        System.out.println("Четные числа");
        print(even);
        System.out.println("Нечетные числа");
        print(odd);

    }

    public static void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
