package designpatterns.decorator;

public enum SpecialColor implements Color {

    YELLOW(1000), RED(2300), GREEN(4000), BLUE(5000);

    int price;

    SpecialColor(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
