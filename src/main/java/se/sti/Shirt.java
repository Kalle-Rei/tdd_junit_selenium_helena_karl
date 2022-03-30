package se.sti;

public class Shirt extends Clothes{

    private String size;
    private String colour;

    public Shirt(double price, String size, String colour){
        super(price);
        this.size = size;
        this.colour = colour;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
