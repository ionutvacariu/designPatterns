package application.decorator;

import java.util.Objects;

public abstract class CO2EmissionsDecorator implements Car {


    Car decoratedCar;

    public CO2EmissionsDecorator(Car decoratedCar) {
        super();
        this.decoratedCar = decoratedCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CO2EmissionsDecorator that = (CO2EmissionsDecorator) o;
        return Objects.equals(decoratedCar, that.decoratedCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(decoratedCar);
    }
}
