public class Palawan implements Locations {

    int airFare = 190;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
