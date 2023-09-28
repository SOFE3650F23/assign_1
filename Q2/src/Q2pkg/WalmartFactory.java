package Q2pkg;

public class WalmartFactory extends GroceryProductFactory {
    //concrete factory for NoFrills stores
    public String location;
    public final String store = "Walmart";

    public WalmartFactory(String l){
        location = l;
    }

    @Override
    public Fruit createBanana(Double price){
        Fruit f = new Banana(price);
        return f;
    }

    @Override
    public Veggie createTomato(Double price){
        Veggie v = new Tomato(price);
        return v;
    }
}
