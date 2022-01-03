class Driver extends Account{

    String number_p;

    public Driver (String name,String document,String email,String password, String number_p){
        super(name, document, email, password);
        this.number_p = number_p;
    }
    void print_data_driver(){
        System.out.println(" | Name driver: "+ name + " | Document driver:" + document + " | E-mail: " + email + " | Password: " + password);
    } 
}