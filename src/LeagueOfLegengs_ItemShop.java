public abstract class LeagueOfLegengs_ItemShop {
    protected int Ability_Haste = 0;
    protected int Ability_Power = 0;
    protected int Armor = 0;
    protected float Heal_and_Shield_Power = 0;
    protected int Health = 0;
    protected int Magic_Resistance = 0;
    protected int Mana = 0;
    protected float Mana_Regen = 0;
    protected float Move_Speed = 0;
    protected int price = 0;
    protected String Name;

    public LeagueOfLegengs_ItemShop(String name) {
        Name = name;
    }

    public int getAbility_Haste() {
        return Ability_Haste;
    }

    public void setAbility_Haste(int ability_Haste) {
        Ability_Haste = ability_Haste;
    }

    public int getAbility_Power() {
        return Ability_Power;
    }

    public void setAbility_Power(int ability_Power) {
        Ability_Power = ability_Power;
    }

    public int getArmor() {
        return Armor;
    }

    public void setArmor(int armor) {
        Armor = armor;
    }

    public float getHeal_and_Shield_Power() {
        return Heal_and_Shield_Power;
    }

    public void setHeal_and_Shield_Power(float heal_and_Shield_Power) {
        Heal_and_Shield_Power = heal_and_Shield_Power;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getMagic_Resistance() {
        return Magic_Resistance;
    }

    public void setMagic_Resistance(int magic_Resistance) {
        Magic_Resistance = magic_Resistance;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int mana) {
        Mana = mana;
    }

    public float getMana_Regen() {
        return Mana_Regen;
    }

    public void setMana_Regen(float mana_Regen) {
        Mana_Regen = mana_Regen;
    }

    public float getMove_Speed() {
        return Move_Speed;
    }

    public void setMove_Speed(float move_Speed) {
        Move_Speed = move_Speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
