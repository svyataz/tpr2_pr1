import java.util.Dictionary;
import java.util.Hashtable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dictionary item_list = new Hashtable();
        item_list.put("Amplifying_Tome", new Basic("Amplifying_Tome"));
        System.out.println(item_list.get("Amplifying_Tome").toString());
    }
}