import java.util.ArrayList;

public abstract class Tank_items extends LeagueOfLegengs_ItemShop{
    protected String PASSIVE = "-";
    protected ArrayList<LeagueOfLegengs_ItemShop> made_of;

    public Tank_items(int ability_Haste, int ability_Power, int armor, double heal_and_Shield_Power, int health, int magic_Resistance, int mana, double mana_Regen, double move_Speed, int price, String name, String PASSIVE, ArrayList<LeagueOfLegengs_ItemShop> made_of) {
        super(ability_Haste, ability_Power, armor, heal_and_Shield_Power, health, magic_Resistance, mana, mana_Regen, move_Speed, price, name);
        this.PASSIVE = PASSIVE;
        this.made_of = made_of;
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
