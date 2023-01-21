package designpatterns.decorator;

public class CO2Emissions extends CO2EmissionsDecorator {

    int co2Em;

    private static final int threshold = 250;
    private static final int fee = 300;

    public CO2Emissions(Car decoratedCar, int co2Em) {
        super(decoratedCar);
        this.co2Em = co2Em;
    }

    @Override
    public void color() {
        decoratedCar.color();
    }

    @Override
    public void description() {
        decoratedCar.color();
        System.out.println("Emisii de " + co2Em);
    }

    @Override
    public int price() {
        int x = 0;
        if (this.co2Em > threshold) {
            int overLimit = this.co2Em - threshold;
            x = decoratedCar.price() + overLimit * fee;
            System.out.println(x);
        }
        return x;
    }
}
