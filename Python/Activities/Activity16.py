class Car:
    def __init__(self,manufacturer, model, make, transmission, color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color

    def accelerate(self):
        print(self.manufacturer, self.model, "is moving")

    def stop(self):
        print(self.manufacturer, self.model, "has stopped")

car1 = Car("Ford","Mustang", 2018,"automatic","red")
car2 = Car("Volkswagen","SUV", 2020,"automatic","black")
car3 = Car("Suzuki","Desire", 2019,"manual","silver")

car1.accelerate()
car2.accelerate()
car1.stop()
car2.stop()
car3.accelerate()