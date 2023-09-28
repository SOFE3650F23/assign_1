package Q2pkg;
import java.util.*;

public class NoFrillsFactory extends GroceryProductFactory {
    //concrete factory for NoFrills stores
    public String location;
    public final String store = "Walmart";

    public NoFrillsFactory(String l){
        location = l;
    }

    @Override
    public Fruit createFruit(String n){
        Fruit f = new Fruit();
        return f;
    }

    @Override
    public Veggie createVeggie(String n){
        Veggie v = new Veggie();
        return v;
    }
}
