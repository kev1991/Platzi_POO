from car import Car
from account import Account

if __name__ == "__main__":
    print("Hi wordl, I got it")

    car = Car("AJK-215", Account("Kebin Martinez", "123456"))
    print(vars(car))
    print(vars(car.driver))