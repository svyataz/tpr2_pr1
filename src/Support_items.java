import java.util.ArrayList;

public abstract class Support_items extends LeagueOfLegengs_ItemShop{
    private String PASSIVE = "-";
    protected ArrayList<LeagueOfLegengs_ItemShop> made_of;
    public Support_items(String name, int price) {
        super(price, name);
        made_of = new ArrayList<>();
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

    @Override
    public String toString() {
        return super.toString() + "Support_items{" +
                "PASSIVE='" + PASSIVE + '\'' +
                ", made_of=" + made_of +
                '}';
    }

}
