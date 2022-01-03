console.log("_______Wlcome to Uber_______");
console.log("_________________________________________");

console.log("_______Uber X_______");

var uberX = new UberX("AW456", new Account("Andrea Ferran", "ANDA765"), "Chevrolet", "Spark")
uberX.passenger = 4;
uberX.print_data_car();
console.log("_________________________________________");

console.log("_______Driver_______");

var driver = new Driver("kebin Martinez","10074AWE","kebin@gmail.com","??????????");
driver.print_data_user();

console.log("_________________________________________");

console.log("_______User_______");

var user = new User("Valeria Godoy","ZXC12345","valeri@gmail.com","********");
driver.print_data_user();