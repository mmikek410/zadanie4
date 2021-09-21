import java.security.PrivateKey;

public class cards {
    private String name;
    private int card;


    public cards(String name, int card) {
        this.name = name;
        this.card = card;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return card;
    }



    @Override
    public String toString() {
        return "cards{" +
                "name='" + name + '\'' +
                ", age=" + card +
                '}';
    }
}
