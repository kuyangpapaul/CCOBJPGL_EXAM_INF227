public class Me implements Tourist {
      
    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {
 if (boracay.airFare > budget ){
        System.out.println("Kulang na pera mo kuys, stay ka na lang sa bahay :( ");
}
else{
        System.out.println("Andito na ako sa Boracay yeheyyy!!! ");
        budget = budget - boracay.airFare;   
}
        checkBudget();
    }

    public void visit(Tagaytay tagaytay) {
 if (tagaytay.airFare > budget){
        System.out.println("Kulang na pera mo kuys stay ka na lang sa bahay :( ");
}
else{
        System.out.println("Andito naman ako sa Tagayatay yeheyyy!!!  ");
        budget = budget - tagaytay.airFare;
}
        checkBudget();
    }

    public void visit(Lucban lucban) {
  if (lucban.airFare > budget){
        System.out.println("Kulang na pera mo kuys stay ka na lang sa bahay :( ");
}
else{
        System.out.println("Andito naman ako sa Lucban yeheyyy!!!  ");
        budget = budget - lucban.airFare;
}
        checkBudget(); 
    }

    public void visit(Palawan palawan) {
  if (palawan.airFare > budget){
        System.out.println("Kulang na pera mo kuys stay ka na lang sa bahay :( ");
}
else{
        System.out.println("Andito naman ako sa Palawan yeheyyy!!!  ");
        budget = budget - palawan.airFare;
}
        checkBudget();
   
    }

    public void visit(Cebu cebu) {
   if (cebu.airFare > budget){
        System.out.println("Kulang na pera mo kuys stay ka na lang sa bahay :( ");
}
else{
        System.out.println("Andito naman ako sa Cebu yeheyyy!!!  ");
        budget = budget - cebu.airFare;
}
        checkBudget();
       
    }
    public void visit(PuertoGalera puertoGalera) {
   if (puertoGalera.airFare > budget){
        System.out.println("Kulang na pera mo kuys stay ka na lang sa bahay :( ");
}
else{
        System.out.println("Andito naman ako sa Puerto Galera  yeheyyy!!!  ");
        budget = budget - puertoGalera.airFare;
}
        checkBudget();
        
    }


    public void checkBudget() {
        System.out.println("my budget is " + budget);

    }
}
