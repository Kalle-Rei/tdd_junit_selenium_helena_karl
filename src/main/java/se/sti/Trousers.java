package se.sti;

public class Trousers extends Clothes{

    private String size;
    private boolean isDenim;

    public Trousers(double price, String size, boolean isDenim){
        super(price);
        this.size = size;
        this.isDenim = isDenim;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isDenim() {
        return isDenim;
    }

    public void setDenim(boolean denim) {
        isDenim = denim;
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "price=" + price +
                ", size='" + size + '\'' +
                ", isDenim=" + isDenim +
                '}';
    }
}
