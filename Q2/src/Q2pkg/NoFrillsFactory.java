package Q2pkg;

public class NoFrillsFactory extends GroceryProductFactory {
    //concrete factory for NoFrills stores
    public String location;
    public final String STORE = "NoFrills";

    public NoFrillsFactory(String l){
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
