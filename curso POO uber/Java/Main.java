public class Main {
    public static void main(String[] args) {
        System.out.println("hello kev");
        Car car = new Car("AMQ123", new Account("Kebin Martinez", "1007423"));
        car.passegenger = 4;
        car.print_data_car();

        Car car2 = new Car("KYV212", new Account("Valeria Godoy", "1007423"));
        car2.passegenger = 2;
        car2.print_data_car();
    }
}
