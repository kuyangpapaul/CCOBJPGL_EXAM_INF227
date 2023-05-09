public class Palawan implements Locations {

    int airFare = 130;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}