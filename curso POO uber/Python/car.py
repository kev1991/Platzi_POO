from account import Account
class Car:
    id          = int
    lincense    = str
    driver      = Account("","")
    passegenger = int

    def __init__(self, lincense, driver):
        self.lincense = lincense
        self.driver = driver