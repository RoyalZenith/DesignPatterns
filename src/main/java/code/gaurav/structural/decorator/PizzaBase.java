package code.gaurav.structural.decorator;

public class PizzaBase implements Ingredients{
    private static final String desc = "Pizza Base";
    private static final int price = 50;

    Ingredients ingredients ;
    public PizzaBase(){}



    public PizzaBase(Ingredients ingredients){
        this.ingredients = ingredients;
    }
    @Override
    public int getCost() {
        if(ingredients!=null) {
            return ingredients.getCost() + price;
        }else{
            return price;
        }

    }

    @Override
    public void getDescription() {
        if(ingredients != null) {
            ingredients.getDescription();
            System.out.print("+ " + desc);
        }else{
            System.out.print(desc);
        }
    }
}
