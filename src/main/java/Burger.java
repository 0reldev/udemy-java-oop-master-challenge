public class Burger {

    private String type;
    private double price;
    private String topping1 = null;
    private String topping2 = null;
    private String topping3 = null;
    private String topping4 = null;
    private String topping5 = null;

    public Burger() {
        type = "Regular burger";
        price = 5d;
    }

    public Burger(String type, double price) {
        this.type = type;
        this.price = type.equals("Deluxe Burger") ? 8d : price;
    }



    public void addTopping(String topping) {
        if (topping1 == null) {
            topping1 = topping;
            price += type.equals("Deluxe Burger") ? 0 : 5;
        } else if (topping2 == null) {
            topping2 = topping;
            price += type.equals("Deluxe Burger") ? 0 : 10;
        } else if (topping3 == null) {
            topping3 = topping;
            price += type.equals("Deluxe Burger") ? 0 : 15;
        } else if (topping4 == null && type.equals("Deluxe Burger")) {
            topping4 = topping;
        } else if (topping5 == null && type.equals("Deluxe Burger")) {
            topping5 = topping;
        } else {
            System.out.println("The burger already has three toppings.");
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", topping1='" + topping1 + '\'' +
                ", topping2='" + topping2 + '\'' +
                ", topping3='" + topping3 + '\'' +
                '}';
    }

    public double getPrice() {
        return price;
    }
}
