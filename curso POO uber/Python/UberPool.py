from _typeshed import Self
from car import Car

class UberPool(Car):
    brand = []
    model = []

    def __init__(self, lincense, driver, brand, model):
        super().__init__(lincense, driver) 
        
        self.brand = brand
        self.model = model 