import java.util.Dictionary;
import java.util.Hashtable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dictionary<String, LeagueOfLegengs_ItemShop> item_list = new Hashtable();
        Basic buff;
        //базовые предметы
        buff = new Basic("Amplifying_Tome", 400);
        buff.setAbility_Power(20);
        item_list.put("Amplifying_Tome", buff);

        buff = new Basic("Cloth_Armor", 300);
        buff.setArmor(15);
        item_list.put("Cloth_Armor", buff);

        buff = new Basic("Faerie_Charm", 250);
        buff.setMana_Regen(0.5);
        item_list.put("Faerie_Charm", buff);

        buff = new Basic("GLowing_Mote", 300);
        buff.setAbility_Haste(5);
        item_list.put("GLowing_Mote", buff);

        buff = new Basic("Null-Magic_Mantle", 400);
        buff.setMagic_Resistance(20);
        item_list.put("Null-Magic_Mantle", buff);

        buff = new Basic("Ruby_Crystal", 400);
        buff.setHealth(150);
        item_list.put("Ruby_Crystal", buff);

        buff = new Basic("Sapphire_Crystal", 350);
        buff.setMana(250);
        item_list.put("Sapphire_Crystal", buff);
        //Sup_EPIC
        Sup_EPIC SEbuff = new Sup_EPIC("Fiendish_Codex", 900);

        SEbuff.setAbility_Haste(10);
        SEbuff.setAbility_Power(25);
        SEbuff.addToMade_of(item_list.get("Amplifiying_Tome"));
        SEbuff.addToMade_of(item_list.get("GLowing_Mote"));
        item_list.put("Fiendish_Codex", buff);

        SEbuff = new Sup_EPIC("Forbidden_Idol", 800);
        SEbuff.setMana_Regen(0.5);
        SEbuff.setHeal_and_Shield_Power(0.8);
        SEbuff.addToMade_of(item_list.get("Faerie_Charm"));
        item_list.put("Forbidden_Idol", buff);


        System.out.println(item_list.get("Fiendish_Codex ").toString());
    }
}