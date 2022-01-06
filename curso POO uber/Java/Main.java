public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Uber");

        System.out.println("__________________________");

        System.out.println("....Driver....");
        Driver driver = new Driver("Kebin Martinez", "AQWE123456789", "kebin@gmail.com", "******", "318-361-9671");
        driver.print_data_driver();

        System.out.println("__________________________ ");

        System.out.println("....Uber X....");
        UberX uberX = new UberX("2ADK-212",new Account("Kebin Martinez","AQWE123456789","kebin@gmail.com","147258369"), "Toyota", "2020");
        uberX.setPassenger(4);
        uberX.print_data_car();

        System.out.println("__________________________ ");

        System.out.println("....User....");

        User user = new User("Valeria Godoy", "147852369", "valeriag@gmail.com", "******", "316-365-6467");
        user.print_data_user(); 

        System.out.println("__________________________ ");

        System.out.println("....Uber Van....");

        UberVan uberVan = new UberVan("ASD-234", new Account("Kebin Martinez","AQWE123456789","kebin@gmail.com","147258369"));
        uberVan.setPassenger(6);
        uberVan.print_data_car(); 
        
    }
}
