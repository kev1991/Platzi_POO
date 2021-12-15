from car import Car

if __name__ == "__main__":
    print("Hi wordl, I got it")
    car = Car()
    car.lincense = "AJK-215"
    car.driver = "Kebin Martinez"
    print(vars(car))

    car2 = Car()
    car2.lincense = "ZSD-555"
    car2.driver = "Valeria Martinez"
    print(vars(car2))