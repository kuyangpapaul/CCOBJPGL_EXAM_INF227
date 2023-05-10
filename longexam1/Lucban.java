public class Lucban implements Locations {

    int airFare = 169;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
