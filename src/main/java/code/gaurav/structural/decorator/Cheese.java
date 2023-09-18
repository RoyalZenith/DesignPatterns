package code.gaurav.structural.decorator;

public class Cheese implements Ingredients{
    private static final String desc = "Cheese topping";
    private static final int price = 500;

    Ingredients ingredients ;

    public Cheese(Ingredients ingredients){
        this.ingredients = ingredients;
    }
    @Override
    public int getCost() {
        return ingredients.getCost() + price;

    }

    @Override
    public void getDescription() {
        ingredients.getDescription();
        System.out.print("+ "+desc);
    }
}
