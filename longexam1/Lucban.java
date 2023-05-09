public class Lucban implements Locations {

    int airFare = 167;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
