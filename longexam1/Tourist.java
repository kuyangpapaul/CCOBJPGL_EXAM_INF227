interface Tourist {

    int budget = 0;

    void visit();

    void visit(Boracay boracay);
    void visit(Tagaytay tagaytay);
    void visit(Lucban lucban);
    void visit(Palawan palawan);
    void visit(Cebu cebu);
    void visit(PuertoGalera puertoGalera);
    
    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();

}