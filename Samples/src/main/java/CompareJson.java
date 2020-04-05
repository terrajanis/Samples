import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.*;
import java.util.HashSet;

public class CompareJson {


    public static void main(String[] args) throws IOException {
        HashSet<String> cabins = returnCabinsList();
        HashSet<String> cabinsShake = returnCabinsWithShakingList();
       if(cabins.equals(cabinsShake)) {
           System.out.println("All right");
       }

       else {
           System.out.println("Bug");
           cabins.removeAll(cabinsShake);
           System.out.println(cabins);
           System.out.println(cabinsShake);
       }

    }


    public static HashSet<String> returnCabinsList() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader (new FileReader(new File("src/main/resources/cabins.json")));

        JsonArray jsonArray = new JsonParser().parse(reader).getAsJsonArray();

        HashSet<String> cabins = new HashSet<>();

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject propertiesJson = (JsonObject) jsonArray.get(i);
            JsonObject venue = propertiesJson.getAsJsonObject("venue");
            String cabin = venue.get("name").getAsString();
            cabins.add(cabin);
        }

        return cabins;
    }

    public static HashSet<String> returnCabinsWithShakingList() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader (new FileReader(new File("src/main/resources/shakefor.json")));

        JsonArray jsonArray = new JsonParser().parse(reader).getAsJsonArray();

        HashSet<String> cabinsShake = new HashSet<>();

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonObject propertiesJson = (JsonObject) jsonArray.get(i);
            JsonObject venue = propertiesJson.getAsJsonObject("venue");
            String cabin = venue.get("name").getAsString();
            cabinsShake.add(cabin);
        }

        return cabinsShake;
    }
}
