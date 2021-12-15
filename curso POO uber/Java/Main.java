public class Main {
    public static void main(String[] args) {
        System.out.println("hello kev");
        Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Kebin Martinez";
        car.passegenger = 4;
        car.print_data_car();

        Car car2 = new Car();
        car2.license = "KYV212";
        car2.driver = "Valeria Godoy";
        car2.passegenger = 2;
        car2.print_data_car();
    }
}
