import java.util.ArrayList;

public class Sup_LEGENDARY extends Support_items{
    private String Active;

    public Sup_LEGENDARY(int ability_Haste, int ability_Power, int armor, double heal_and_Shield_Power, int health, int magic_Resistance, int mana, double mana_Regen, double move_Speed, int price, String name, ArrayList<LeagueOfLegengs_ItemShop> made_of, String PASSIVE, String active) {
        super(ability_Haste, ability_Power, armor, heal_and_Shield_Power, health, magic_Resistance, mana, mana_Regen, move_Speed, price, name, made_of, PASSIVE);
        Active = active;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }
}
