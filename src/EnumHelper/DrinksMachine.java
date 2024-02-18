package EnumHelper;

public enum DrinksMachine {
    COFFEE(4.2, 0),
    TEA(3.5, 0),
    LEMONADE(7.3, 0),
    MOJITO(12.5, 0),
    SODA(1.4,0),
    COLA(6.5,0);

    private final double price;
    private int count;

    DrinksMachine(double price, int count) {
        this.price = price;
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
