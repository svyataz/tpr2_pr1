import java.util.ArrayList;

public abstract class Support_items extends LeagueOfLegengs_ItemShop{
    protected String PASSIVE = "-";
    protected ArrayList<LeagueOfLegengs_ItemShop> made_of;

    public Support_items(int ability_Haste, int ability_Power, int armor, double heal_and_Shield_Power, int health, int magic_Resistance, int mana, double mana_Regen, double move_Speed, int price, String name, ArrayList<LeagueOfLegengs_ItemShop> made_of, String PASSIVE) {
        super(ability_Haste, ability_Power, armor, heal_and_Shield_Power, health, magic_Resistance, mana, mana_Regen, move_Speed, price, name);
        this.made_of = made_of;
        PASSIVE = PASSIVE;
    }

    public String getPASSIVE() {
        return PASSIVE;
    }

    public void setPASSIVE(String PASSIVE) {
        this.PASSIVE = PASSIVE;
    }

    public ArrayList<LeagueOfLegengs_ItemShop> getMade_of() {
        return made_of;
    }

    public void addToMade_of(LeagueOfLegengs_ItemShop ob) {
        made_of.add(ob);
    }
}
