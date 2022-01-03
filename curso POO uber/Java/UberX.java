class UberX extends Car{
    String brand;
    String model;

    public UberX(String license, Account driver, String brand, String model){
        super(license, driver);
        this.brand = brand;
        this.model = model;
    }
    void print_data_UberX(){
        System.out.println("| License: " + license + " | Drand: "+ brand + " | Model: "+ model + " | Passegenger: "+ passegenger);
    } 

}


