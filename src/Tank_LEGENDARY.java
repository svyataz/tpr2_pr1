import java.util.ArrayList;

public class Tank_LEGENDARY extends Tank_items{
    private String Active;
    public Tank_LEGENDARY(String name, int price) {
        super(name, price);
        made_of = new ArrayList<>();
    }

    public String getActive() {
        return Active;
    }

    public void setActive(String active) {
        Active = active;
    }

    @Override
    public String toString() {
        return super.toString() + "Sup_LEGENDARY{" +
                "Active='" + Active + '\'' +
                '}';
    }
}
