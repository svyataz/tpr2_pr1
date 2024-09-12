import java.util.ArrayList;

public class Tank_LEGENDARY extends Tank_items{
    private String Active;

    public Tank_LEGENDARY(int ability_Haste, int ability_Power, int armor, double heal_and_Shield_Power, int health, int magic_Resistance, int mana, double mana_Regen, double move_Speed, int price, String name, String PASSIVE, ArrayList<LeagueOfLegengs_ItemShop> made_of, String active) {
        super(ability_Haste, ability_Power, armor, heal_and_Shield_Power, health, magic_Resistance, mana, mana_Regen, move_Speed, price, name, PASSIVE, made_of);
        Active = active;
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }
}
