public class Lucban implements Locations {

    int airFare = 120;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}