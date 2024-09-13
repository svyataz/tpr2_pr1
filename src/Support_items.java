import java.util.ArrayList;

public abstract class Support_items extends LeagueOfLegends_ItemShop {
    private String PASSIVE = "-";
    protected ArrayList<LeagueOfLegends_ItemShop> made_of;
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

    public ArrayList<LeagueOfLegends_ItemShop> getMade_of() {
        return made_of;
    }

    public void addToMade_of(LeagueOfLegends_ItemShop ob) {
        made_of.add(ob);
    }


}
