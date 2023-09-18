package code.gaurav.structural.decorator;

public class tomoto implements Ingredients{
    private static final String desc = "Tomoto topping";
    private static final int price = 5;

    Ingredients ingredients ;

    public tomoto(Ingredients ingredients){
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
