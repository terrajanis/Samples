import java.util.ArrayList;
import java.util.TreeMap;

public class SortingByDigits {

    public static String order(String words) {
        String result;

        if (! words.equals("")) {
            String[] separateWords = words.split(" ");
            TreeMap<Character, String> map = new TreeMap<>();

            for (int i = 0; i < separateWords.length; i++) {
                char[] strToArray = separateWords[i].toCharArray();
                char[] numbers = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
                for (int j = 0; j < strToArray.length; j++) {
                    char letter = strToArray[j];
                    for (int k = 0; k < numbers.length; k++) {
                        if (letter == numbers[k]) {
                          map.put(letter, separateWords[i] + " ");

                        }

                    }
                }
            }

           result = map.values()
                    .stream()
                    .map(Object::toString)
                    .reduce("", String::concat)
                    .trim();
        } else {
          result = " ";
        }

        return result;
    }

    public static String getDialString(String phone) {
        char[] symbols = phone.toCharArray();
        ArrayList<String> correctSymbols = new ArrayList<>();
        for (int i = 0; i < symbols.length; i++) {
            if(symbols[i] != '(' && symbols[i] != '-' && symbols[i] != ')') {
                correctSymbols.add(Character.toString(symbols[i]));
            }
        }

        StringBuilder strbul = new StringBuilder();
        for(String str : correctSymbols)
        {
            strbul.append(str);
        }

        String str = strbul.toString();
        String phoneNumber = "callto://" + str;
        return phoneNumber;
    }

    public static void main (String[] args) {
        String result = order("is2 Thi1s T4est 3a");
        System.out.println(result);

        String phone = getDialString("+38(050)123-45-67");
        System.out.println(phone);
    }
}
