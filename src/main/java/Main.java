public class Main {

    public static void main(String[] args) {

        Meal defaultMeal = new Meal();
        System.out.println(defaultMeal.toString());

        Burger cheeseBurger = new Burger("Cheeseburger", 10);
        cheeseBurger.addTopping("Salad");
        cheeseBurger.addTopping("Tomato");
        cheeseBurger.addTopping("Bacon");
        cheeseBurger.addTopping("Egg");
        Drink smallCoke = new Drink();
        SideItem fries = new SideItem();
        Meal otherMeal = new Meal(cheeseBurger, smallCoke, fries);
        System.out.println(otherMeal.toString());

        Burger deluxeBurger = new Burger("Deluxe Burger", 10);
        deluxeBurger.addTopping("Salad");
        deluxeBurger.addTopping("Tomato");
        deluxeBurger.addTopping("Bacon");
        deluxeBurger.addTopping("Egg");
        deluxeBurger.addTopping("Mushrooms");
        Meal deluxeMeal = new Meal(deluxeBurger, smallCoke, fries);
        System.out.println(deluxeMeal.toString());

        smallCoke.setSize("big");
        System.out.println(deluxeMeal.toString());

        System.out.println(defaultMeal.getPrice());
        System.out.println(otherMeal.getPrice());
        System.out.println(deluxeMeal.getPrice());
    }
}
