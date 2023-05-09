public class PuertoGalera implements Locations {

    int airFare = 185;

    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
