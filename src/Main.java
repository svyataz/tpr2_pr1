import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Dictionary<String, LeagueOfLegengs_ItemShop> item_list = new Hashtable();
        ArrayList<String> names = new ArrayList<>();
        Basic buff;
        //базовые предметы
        buff = new Basic("Amplifying_Tome", 400);
        names.add("Amplifying_Tome");
        buff.setAbility_Power(20);
        item_list.put("Amplifying_Tome", buff);

        buff = new Basic("Cloth_Armor", 300);
        names.add("Cloth_Armor");
        buff.setArmor(15);
        item_list.put("Cloth_Armor", buff);

        buff = new Basic("Faerie_Charm", 250);
        names.add("Faerie_Charm");
        buff.setMana_Regen(0.5);
        item_list.put("Faerie_Charm", buff);

        buff = new Basic("GLowing_Mote", 300);
        names.add("GLowing_Mote");
        buff.setAbility_Haste(5);
        item_list.put("GLowing_Mote", buff);

        buff = new Basic("Null-Magic_Mantle", 400);
        names.add("Null-Magic_Mantle");
        buff.setMagic_Resistance(20);
        item_list.put("Null-Magic_Mantle", buff);

        buff = new Basic("Ruby_Crystal", 400);
        names.add("Ruby_Crystal");
        buff.setHealth(150);
        item_list.put("Ruby_Crystal", buff);

        buff = new Basic("Sapphire_Crystal", 350);
        names.add("Sapphire_Crystal");
        buff.setMana(250);
        item_list.put("Sapphire_Crystal", buff);

        //Sup_EPIC
        Sup_EPIC SEbuff = new Sup_EPIC("Fiendish_Codex", 900);

        names.add("Fiendish_Codex");
        SEbuff.setAbility_Haste(10);
        SEbuff.setAbility_Power(25);
        SEbuff.addToMade_of(item_list.get("Amplifiying_Tome"));
        SEbuff.addToMade_of(item_list.get("GLowing_Mote"));
        item_list.put("Fiendish_Codex", SEbuff);

        SEbuff = new Sup_EPIC("Forbidden_Idol", 800);
        names.add("Forbidden_Idol");
        SEbuff.setMana_Regen(0.5);
        SEbuff.setHeal_and_Shield_Power(0.8);
        SEbuff.addToMade_of(item_list.get("Faerie_Charm"));
        item_list.put("Forbidden_Idol", SEbuff);

        SEbuff = new Sup_EPIC("Kindlegem", 800);
        names.add("Kindlegem");
        SEbuff.setHealth(200);
        SEbuff.setAbility_Haste(10);
        SEbuff.addToMade_of(item_list.get("Faerie_Charm"));
        SEbuff.addToMade_of(item_list.get("Ruby_Crystal"));
        item_list.put("Kindlegem", SEbuff);

        SEbuff = new Sup_EPIC("Oblivion_Orb", 800);
        names.add("Oblivion_Orb");
        SEbuff.setAbility_Power(30);
        SEbuff.setPASSIVE("Grievous_Wounds");
        SEbuff.addToMade_of(item_list.get("Amplifying_Tome"));
        item_list.put("Oblivion_Orb", SEbuff);

        //Sup_Legendary
        for(String i: names){
            System.out.println(item_list.get(i).toString());
        }
    }
}