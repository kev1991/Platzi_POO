class User extends Account{
    String number_p;
    public User (String name, String document,String email, String password, String number_p){
        super(name, document, email, password);
        this.number_p = number_p;
    }
    void print_data_user(){
        System.out.println(" | Document driver: "+ document + " | Name driver: " + name + " | E-mail: " + email + " | Password: " + password);
    } 
}