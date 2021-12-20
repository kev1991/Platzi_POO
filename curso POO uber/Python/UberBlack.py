from car import Car

class UberBlack(Car):
    typeCarAccepted = []
    seatsMaterials = []

    def __init__(self, lincense, driver, typeCarAccepted, seatsMaterials):
        super().__init__(lincense, driver)
        
        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterials  = seatsMaterials 