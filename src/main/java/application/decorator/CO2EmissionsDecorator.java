package application.decorator;

public abstract class CO2EmissionsDecorator implements Car {


    Car decoratedCar;

    public CO2EmissionsDecorator(Car decoratedCar) {
        super();
        this.decoratedCar = decoratedCar;
    }


}
