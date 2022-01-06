import java.util.Map;
import java.util.ArrayList;

class UberVan extends Car{
    Map<String, Map<Integer, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;
    Integer passengers;

    // public UberVan(String license, Account driver, 
    // Map<String,Map<Integer, Integer>> typeCarAccepted,
    //  ArrayList<String> seatsMaterial){

    //     super(license, driver);
    //     this.typeCarAccepted = typeCarAccepted; 
    //     this.seatsMaterial = seatsMaterial;
    // }

    public UberVan(String license, Account driver){

        super(license, driver);
    }
    
    @Override
    public void setPassenger(Integer passengers) {
        if(passengers == 6){
            this.passengers = passengers;
        }else{
            System.out.println("Necesitas asignar 6 pasajeros");
         } 
    }
}

