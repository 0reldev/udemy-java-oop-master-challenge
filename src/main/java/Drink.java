public class Drink {

    private String type;
    private String size = "small";
    private double price = 3d;


    public Drink() {
        type = "Small coke";
    }

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
        price = size == "small" ? 3d : 6d;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }

    public void setSize(String size) {
        this.size = size;
        if (size.equals("big")) this.price = 6;
        else this.price = 3;
    }

    public double getPrice() {
        return price;
    }
}
