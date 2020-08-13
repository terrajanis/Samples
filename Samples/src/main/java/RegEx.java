import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(fileName1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));

        while (reader2.ready()) {
            String line = reader2.readLine();
            Pattern p = Pattern.compile("\\b\\d+\\b");
            Matcher m = p.matcher(line);
            while (m.find()){
                writer.write(m.group() + " ");
            }
        }

        reader2.close();
        writer.close();
    }

    public static void readerSample() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        reader.close();

        BufferedReader reader2 = new BufferedReader(new FileReader(file1));
        BufferedWriter writer = new BufferedWriter(new FileWriter(file2));

        while(reader2.ready()) {
            String line = reader2.readLine().replaceAll("\\.", "!");
            writer.write(line);
        }

        reader2.close();
        writer.close();
    }

}
