package code.gaurav.structural.decorator;

public class Pizza {
    public static void main(String[] args) {
        Ingredients pizza = new Cheese(new Onion(new PizzaBase()));
        System.out.println(pizza.getCost());
        pizza.getDescription();
    }
}
