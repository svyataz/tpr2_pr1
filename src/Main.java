import java.util.Dictionary;
import java.util.Hashtable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dictionary item_list = new Hashtable();
        LeagueOfLegengs_ItemShop buff;

        buff = new Basic("Amplifying_Tome", 400);
        buff.setAbility_Power(20);
        item_list.put("Amplifying_Tome", buff);

        buff = new Basic("Cloth_Armor", 300);
        buff.setArmor(15);
        item_list.put("Cloth_Armor", buff);

        buff = new Basic("Faerie_Charm", 250);
        buff.setMana_Regen(0.5);
        item_list.put("Faerie_Charm", buff);

        buff = new Basic("Cloth_Armor", 300);
        buff.setArmor(15);
        item_list.put("Cloth_Armor", buff);

        buff = new Basic("Cloth_Armor", 300);
        buff.setArmor(15);
        item_list.put("Cloth_Armor", buff);

        buff = new Basic("Cloth_Armor", 300);
        buff.setArmor(15);
        item_list.put("Cloth_Armor", buff);

        buff = new Basic("Cloth_Armor", 300);
        buff.setArmor(15);
        item_list.put("Cloth_Armor", buff);
        //System.out.println(item_list.get("Amplifying_Tome").toString());
    }
}