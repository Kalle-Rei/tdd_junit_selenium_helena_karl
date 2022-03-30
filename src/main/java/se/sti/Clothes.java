package se.sti;

public abstract class Clothes {

    protected double price;

    public Clothes(double price){
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "price=" + price +
                '}';
    }
}
