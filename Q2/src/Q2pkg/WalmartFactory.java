package Q2pkg;
import java.util.*;

public class WalmartFactory extends GroceryProductFactory {
    //concrete factory for Walmart stores
    public String location;
    public final String store = "Walmart";

    public WalmartFactory(String l){
        location = l;
    }

    @Override
    public Fruit createFruit(){
        Fruit f = new Fruit();
        return f;
    }

    @Override
    public Veggie createVeggie(){
        Veggie v = new Veggie();
        return v;
    }
}
