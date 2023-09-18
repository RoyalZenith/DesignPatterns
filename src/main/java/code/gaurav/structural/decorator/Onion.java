package code.gaurav.structural.decorator;

public class Onion implements  Ingredients{

    private static final String desc ="Onion topping";
    public static final int price = 34;
    Ingredients ingredients;
    public  Onion(Ingredients ingredients){
        this.ingredients = ingredients;
    }
    @Override
    public int getCost() {
        return ingredients.getCost()+price;

    }

    @Override
    public void getDescription() {
        ingredients.getDescription();
        System.out.print("+ "+desc);
    }
}
