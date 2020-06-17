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

    public static void main (String[] args) {
        String result = order("is2 Thi1s T4est 3a");
        System.out.println(result);
    }
}
