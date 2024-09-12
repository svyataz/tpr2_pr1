import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*Dictionary items_list = new Hashtable<>();
        items_list.put("Amplifying_Tome", new Basic(0,20, 0,0, 0, 0, 0, 0, 0, 400, "Amplifying_Tome"));
        items_list.put("Cloth_Armor",new Basic(0,0, 15,0, 0, 0, 0, 0, 0, 300, "Cloth_Armor"));
        items_list.put("Faerie_Charm",new Basic(0,0, 0,0, 0, 0, 0, 0.5, 0, 250, "Faerie_Charm"));
        items_list.put("GLowing_Mote",new Basic(5,0, 0,0, 0, 0, 0, 0, 0, 250, "GLowing_Mote"));
        items_list.put("Null-Magic_Mantle",new Basic(0,20, 0,0, 0, 0, 0, 0, 0, 400, "Null-Magic_Mantle"));
        items_list.put("Ruby_Crystal",new Basic(0,0, 0,0, 150, 0, 0, 0, 0, 400, "Ruby_Crystal"));
        items_list.put("Sapphire_Crystal",new Basic(0,0, 0,0, 150, 0, 250, 0, 0, 350, "Sapphire_Crystal"));
        items_list.put("Fiendish_Codex",new Sup_EPIC(0,0, 0,0, 150, 0, 250, 0, 0, 350, "Fiendish_Codex", new ArrayList<>(), "-"));
        items_list.put("Forbidden_Idol  ",new Sup_EPIC(0,0, 0,0, 150, 0, 250, 0, 0, 350, "Forbidden_Idol", new ArrayList<>(), "-"));
        items_list.put("Kindlegem",new Sup_EPIC(0,0, 0,0, 150, 0, 250, 0, 0, 350, "Kindlegem", new ArrayList<>(), "-"));
        items_list.put("Oblivion_Orb",new Sup_EPIC(0,0, 0,0, 150, 0, 250, 0, 0, 350, "Oblivion_Orb", new ArrayList<>(), "-"));*/
        Dictionary items_list = new Hashtable<>();
        items_list.put("Amplifying_Tome", new LeagueOfLegengs_ItemShop());
    }
}