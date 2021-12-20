from car import Car

class UberVan(Car):

    typeCarAccepted = []
    seatsMaterial = []

    def __init__(self, lincense, driver, typeCarAccepted, seatsMaterial):
        super().__init__(lincense, driver)

        self.typeCarAccepted = typeCarAccepted
        self.seatsMaterial = seatsMaterial  