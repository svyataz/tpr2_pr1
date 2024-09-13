import java.util.ArrayList;

public class Sup_LEGENDARY extends Support_items{
    private String Active;
    public Sup_LEGENDARY(String name, int price) {
        super(name, price);
        made_of = new ArrayList<>();
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }


}
