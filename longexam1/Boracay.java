public class Boracay implements Locations {

    int airFare = 140;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}