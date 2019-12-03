package application.decorator;

public class MainDecorator {


    public static void main(String[] args) {
        Car car = new Audi(BasicColor.BLACK);


        Car decorated = new CO2Emissions(car, 300);

        decorated.price();
    }




}

