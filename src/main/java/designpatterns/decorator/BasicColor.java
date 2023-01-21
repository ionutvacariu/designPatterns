package designpatterns.decorator;

public enum BasicColor implements Color {

    WHITE, BLACK, GRAY;


    private int price = 3000;


    public int getPrice() {
        return price;
    }
}
