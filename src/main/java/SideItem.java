public class SideItem {

    private String type;
    private double price = 5d;

    public SideItem() {
        type = "Fries";
    }

    @Override
    public String toString() {
        return "SideItem{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    public double getPrice() {
        return price;
    }
}
