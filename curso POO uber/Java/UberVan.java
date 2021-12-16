import java.util.Map;
import java.util.ArrayList;

class UberVan extends Car{
    Map<String, Map<Integer, Integer>> typeCarAccepted;
    ArrayList<String> seatsMaterial;

    public UberVan(String license, Account driver, 
    Map<String,Map<Integer, Integer>> typeCarAccepted,
     ArrayList<String> seatsMaterial){

        super(license, driver);
        this.typeCarAccepted = typeCarAccepted; 
        this.seatsMaterial = seatsMaterial;
    }
}

