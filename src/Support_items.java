import java.util.ArrayList;

public abstract class Support_items extends LeagueOfLegengs_ItemShop{
    protected String PASSIVE = "-";
    protected ArrayList<LeagueOfLegengs_ItemShop> made_of;
    public Support_items(String name) {
        super(name);
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
}
