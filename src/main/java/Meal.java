public class Meal {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    private double price;

    public Meal() {
        this.burger = new Burger();
        this.drink = new Drink();
        this.sideItem = new SideItem();
    }

    public Meal(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "burger=" + burger +
                ", drink=" + drink +
                ", sideItem=" + sideItem +
                '}';
    }

    public double getPrice() {
        return burger.getPrice() + drink.getPrice() + sideItem.getPrice();
    }
}
