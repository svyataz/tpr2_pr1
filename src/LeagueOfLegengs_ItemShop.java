public abstract class LeagueOfLegengs_ItemShop {
    protected int Ability_Haste = 0;
    protected int Ability_Power = 0;
    protected int Armor = 0;
    protected double Heal_and_Shield_Power = 0;
    protected int Health = 0;
    protected int Magic_Resistance = 0;
    protected int Mana = 0;
    protected double Mana_Regen = 0;
    protected double Move_Speed = 0;
    protected int price = 0;
    protected String Name;

    public LeagueOfLegengs_ItemShop(int ability_Haste, int ability_Power, int armor, double heal_and_Shield_Power, int health, int magic_Resistance, int mana, double mana_Regen, double move_Speed, int price, String name) {
        Ability_Haste = ability_Haste;
        Ability_Power = ability_Power;
        Armor = armor;
        Heal_and_Shield_Power = heal_and_Shield_Power;
        Health = health;
        Magic_Resistance = magic_Resistance;
        Mana = mana;
        Mana_Regen = mana_Regen;
        Move_Speed = move_Speed;
        this.price = price;
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

    public double getHeal_and_Shield_Power() {
        return Heal_and_Shield_Power;
    }

    public void setHeal_and_Shield_Power(double heal_and_Shield_Power) {
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

    public double getMana_Regen() {
        return Mana_Regen;
    }

    public void setMana_Regen(double mana_Regen) {
        Mana_Regen = mana_Regen;
    }

    public double getMove_Speed() {
        return Move_Speed;
    }

    public void setMove_Speed(double move_Speed) {
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
