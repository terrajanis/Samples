
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Strings {

    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {



        ArrayList<String> strings1 = new ArrayList<String>();
        strings1.add("string1");
        strings1.add("string2");
        strings1.add("string3");
        strings1.add("string4");
        strings1.add("string5");

        ArrayList<String> strings2 = new ArrayList<String>();
        strings2.add("string7");
        strings2.add("string1");
        strings2.add("string3");
        strings2.add("string0");
        strings2.add("string4");
        strings2.add("string5");
        strings2.add("string6");


        /* while (strings1.size() > 0 && strings2.size() > 0) {
            if (strings1.get(0).equals(strings2.get(0))) {
                lines.add(new LineItem(Type.SAME, strings1.get(0)));
                strings1.remove(0);
                strings2.remove(0);
            }
            else if (strings1.get(1).equals(strings2.get(0))) {
                lines.add(new LineItem(Type.REMOVED, strings1.get(0)));
                strings1.remove(0);
            }
            else {
                lines.add(new LineItem(Type.ADDED, strings2.get(0)));
                strings2.remove(0);
            }
        }

        if (strings1.size() == 0) {
            while (strings2.size() > 0) {
                lines.add(new LineItem(Type.ADDED, strings2.get(0)));
                strings2.remove(0);
            }
        }
        else {
            while (strings1.size() > 0) {
                lines.add(new LineItem(Type.REMOVED, strings1.get(0)));
                strings1.remove(0);
            }
        } */

       if (strings1.size() > strings2.size()) {
          for (int i = 0; i <= (strings1.size() - strings2.size()); i++) {
           strings2.add("");
            }
            for (int i = 0; i < strings1.size(); i++) {
                if (strings1.get(i).equals(strings2.get(i))) {
                    lines.add(new LineItem(Type.SAME, strings1.get(i)));
                } else if (!strings1.get(i).equals(strings2.get(i))) {
                    if(strings2.contains(strings1.get(i))) {
                        lines.add(new LineItem(Type.SAME, strings1.get(i)));
                        lines.add(new LineItem(Type.ADDED, strings2.get(i)));
                    }
                    else {
                        lines.add(new LineItem(Type.REMOVED, strings1.get(i)));
                    }
                }
            }
        }
        else if (strings2.size() > strings1.size()){
            for (int i = 0; i <= (strings2.size() - strings1.size()); i++) {
                strings1.add("");
            }
            for (int i = 0; i < strings2.size(); i++) {
                if (strings2.get(i).equals(strings1.get(i))) {
                    lines.add(new LineItem(Type.SAME, strings1.get(i)));

                }  else if (strings1.get(i).equals("") && !strings1.contains(strings2.get(i))) {
                    lines.add(new LineItem(Type.ADDED, strings2.get(i)));
                }
                else if (strings1.get(i).equals("") && strings1.contains(strings2.get(i))) {
                    lines.add(new LineItem(Type.SAME, strings2.get(i)));
                }
                else if (!strings2.get(i).equals(strings1.get(i))) {
                    if (!strings2.contains(strings1.get(i))) {
                        lines.add(new LineItem(Type.REMOVED, strings1.get(i)));
                    }
                    if(strings1.contains(strings2.get(i))) {
                        lines.add(new LineItem(Type.SAME, strings2.get(i)));
                    }
                    else {
                        lines.add(new LineItem(Type.ADDED, strings2.get(i)));
                    }

                }
            }

        }
        else {
            for (int i = 0; i < strings1.size(); i++) {
                if (strings1.get(i).equals(strings2.get(i))) {
                    lines.add(new LineItem(Type.SAME, strings1.get(i)));
                    //strings2.remove(0);
                } else if (!strings1.get(i).equals(strings2.get(i))) {
                    if(strings2.contains(strings1.get(i))) {
                        lines.add(new LineItem(Type.SAME, strings1.get(i)));
                        lines.add(new LineItem(Type.ADDED, strings2.get(i)));
                      //  strings2.remove(0);
                    }
                    else {
                        lines.add(new LineItem(Type.REMOVED, strings1.get(i)));
                       // strings2.remove(0);
                    }
                }
            }
        }

        for (LineItem s : lines) {
            System.out.println(s.getType());
            System.out.println(s.getLine());
        }


      /*  while (strings1.size() > 0  && strings2.size() > 0) {
            if (strings1.get(0))
        }*/
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public Type getType() {
            return type;
        }

        public String getLine() {
            return line;
        }

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
