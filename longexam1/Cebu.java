public class Cebu implements Locations {

    int airFare = 187;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
