import java.util.List;

public class Root {
    public Object setcards;
    private String  name;
    private List<cards> cards;

    public Root() {
        this.name = name;
        this.cards = cards;
    }

    public String getName() {
        return name;
    }

    public List<cards> getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", cards=" + cards +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setcards(List<cards> cardslist) {
        this.cards = cards;
    }
}
