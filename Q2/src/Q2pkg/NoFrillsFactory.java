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
