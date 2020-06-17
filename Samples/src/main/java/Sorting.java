import java.util.HashMap;
import java.util.Map;
import java.util.Collections;

public class Sorting {

    public static int findIt(int[] a) {

        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[i] == a[j]) {
                    count++;
                }
                result.put(a[i], count);
            }
        }

        int odd = 0;
        for (Map.Entry entry: result.entrySet()) {
            if ((int)entry.getValue()%2 != 0 ) {
                odd = (int) entry.getKey();
                break;
            }
        }
        return odd;
    }

    public static void main (String[] args) {
        int result = findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5});
        System.out.println(result);
    }
}
