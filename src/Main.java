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

        SEbuff = new Sup_EPIC("Oblivion_Orb", 800);
        names.add("Oblivion_Orb");
        SEbuff.setAbility_Power(30);
        SEbuff.setPASSIVE("Grievous_Wounds");
        SEbuff.addToMade_of(item_list.get("Amplifying_Tome"));
        item_list.put("Oblivion_Orb", SEbuff);

        //Sup_Legendary
        Sup_LEGENDARY SLbuff = new Sup_LEGENDARY("Mickael's_Blessing", 2300);

        names.add("Mickael's_Blessing");
        SLbuff.setAbility_Haste(15);
        SLbuff.setActive("Purify(120s)");
        SLbuff.setHealth(250);
        SLbuff.setHeal_and_Shield_Power(0.12);
        SLbuff.setMana_Regen(1);
        SLbuff.addToMade_of(item_list.get("Kindlegem"));
        SLbuff.addToMade_of(item_list.get("Forbidden_Idol"));
        item_list.put("Mickael's_Blessing", SLbuff);

        SLbuff = new Sup_LEGENDARY("Morellonomicon", 2200);
        names.add("Morellonomicon");
        SLbuff.setAbility_Haste(15);
        SLbuff.setPASSIVE("Grievous_Wounds");
        SLbuff.setAbility_Power(90);
        SLbuff.addToMade_of(item_list.get("Fiendish_Codex"));
        SLbuff.addToMade_of(item_list.get("Oblivion_Orb"));
        item_list.put("Morellonomicon", SLbuff);

        SLbuff = new Sup_LEGENDARY("Redemption", 2300);
        names.add("Redemption");
        SLbuff.setAbility_Haste(15);
        SLbuff.setActive("Intervention");
        SLbuff.setHealth(200);
        SLbuff.setHeal_and_Shield_Power(0.15);
        SLbuff.setMana_Regen(1);
        SLbuff.addToMade_of(item_list.get("Kindlegem"));
        SLbuff.addToMade_of(item_list.get("Forbidden_Idol"));
        item_list.put("Redemption", SLbuff);

        //Tank_EPIC
        Tank_EPIC TEbuff = new Tank_EPIC("Chian_Vest", 800);

        names.add("Chian_Vest");
        TEbuff.setAbility_Haste(40);
        TEbuff.addToMade_of(item_list.get("Cloth_Armor"));
        item_list.put("Chian_Vest", TEbuff);

        TEbuff = new Tank_EPIC("Glacial_Buckler", 950);
        names.add("Glacial_Buckler");
        TEbuff.setArmor(20);
        TEbuff.setMana(250);
        TEbuff.setAbility_Haste(10);
        TEbuff.addToMade_of(item_list.get("Cloth_Armor"));
        TEbuff.addToMade_of(item_list.get("GLowing_Mote"));
        TEbuff.addToMade_of(item_list.get("Sapphire_Crystal"));
        item_list.put("Glacial_Buckler", TEbuff);

        TEbuff = new Tank_EPIC("Kindlegem", 800);
        names.add("Kindlegem");
        TEbuff.setHealth(200);
        TEbuff.setAbility_Haste(10);
        TEbuff.addToMade_of(item_list.get("Faerie_Charm"));
        TEbuff.addToMade_of(item_list.get("Ruby_Crystal"));
        item_list.put("Kindlegem", TEbuff);

        TEbuff = new Tank_EPIC("Negatron_Cloak", 900);
        names.add("Negatron_Cloak");
        TEbuff.setMagic_Resistance(50);
        TEbuff.addToMade_of(item_list.get("Null-Magic_Mantle"));
        item_list.put("Negatron_Cloak", TEbuff);

        TEbuff = new Tank_EPIC("Warden's_Mail", 1000);
        names.add("Warden's_Mail");
        TEbuff.setArmor(40);
        TEbuff.setPASSIVE("Rock_Solid");
        TEbuff.addToMade_of(item_list.get("Cloth_Armor"));
        TEbuff.addToMade_of(item_list.get("Cloth_Armor"));
        item_list.put("Warden's_Mail", TEbuff);

        TEbuff = new Tank_EPIC("Winged_Moonplate", 1000);
        names.add("Winged_Moonplate");
        TEbuff.setHealth(150);
        TEbuff.setMove_Speed(0.05);
        TEbuff.addToMade_of(item_list.get("Ruby_Crystal"));
        item_list.put("Winged_Moonplate", TEbuff);

        //Tank_Legendary
        Tank_LEGENDARY TLbuff = new Tank_LEGENDARY("Abyssal_Mask", 2500);

        names.add("Abyssal_Mask");
        TLbuff.setMagic_Resistance(50);
        TLbuff.setPASSIVE("Unmake");
        TLbuff.setHealth(300);
        TLbuff.setAbility_Haste(10);
        TLbuff.addToMade_of(item_list.get("Kindlegem"));
        TLbuff.addToMade_of(item_list.get("Negatron_Cloak"));
        item_list.put("Abyssal_Mask", TLbuff);

        TLbuff = new Tank_LEGENDARY("Frozen_Heart", 2500);
        names.add("Frozen_Heart");
        TLbuff.setArmor(65);
        TLbuff.setPASSIVE("Winter's_Caress_Rock_Solid");
        TLbuff.setMana(600);
        TLbuff.setAbility_Haste(20);
        TLbuff.addToMade_of(item_list.get("Warden's_Mail"));
        TLbuff.addToMade_of(item_list.get("Glacial_Buckler"));
        item_list.put("Frozen_Heart", TLbuff);

        TLbuff = new Tank_LEGENDARY("Solari", 2200);
        names.add("Solari");
        TLbuff.setMagic_Resistance(30);
        TLbuff.setArmor(30);
        TLbuff.setActive("Devotion");
        TLbuff.setHealth(200);
        TLbuff.setAbility_Haste(10);
        TLbuff.addToMade_of(item_list.get("Kindlegem"));
        TLbuff.addToMade_of(item_list.get("Cloth_Armor"));
        TLbuff.addToMade_of(item_list.get("Null-Magic_Mantle"));
        item_list.put("Solari", TLbuff);

        TLbuff = new Tank_LEGENDARY("Triailblazer", 2500);
        names.add("Triailblazer");
        TLbuff.setArmor(40);
        TLbuff.setPASSIVE("Lead_in_Way");
        TLbuff.setMove_Speed(0.05);
        TLbuff.addToMade_of(item_list.get("Chian_Vest"));
        TLbuff.addToMade_of(item_list.get("Winged_Moonplate"));
        item_list.put("Triailblazer", TLbuff);

        for(String i: names){
            System.out.println(item_list.get(i).toString());
        }
    }
}