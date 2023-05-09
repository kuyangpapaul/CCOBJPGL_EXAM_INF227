public class PuertoGalera implements Locations {

    int airFare = 165;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
