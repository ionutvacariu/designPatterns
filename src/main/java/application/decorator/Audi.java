package application.decorator;

public class Audi implements Car {

    private Color basicColor;

    public Audi(Color basicColor) {
        this.basicColor = basicColor;
    }

    private int price = 2500;

    @Override
    public void color() {
        System.out.println("Color of car " + this.basicColor);
    }

    @Override
    public void description() {
        System.out.println("My Audi is " + this.basicColor);
    }

    @Override
    public int price() {
        return price + this.basicColor.getPrice();
    }
}
