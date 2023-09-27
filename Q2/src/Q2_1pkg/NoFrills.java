package Q2_1pkg;

public class NoFrills extends GroceryProductFactory {
     Banana b; //list of bananas and apples?
     Apple a;
     public String location;

    public NoFrills(String l){
        location = l;
        b = null;
        a = null;
    }

    @Override
    public void createBanana(Banana b){
        this.b = b;
    }

    @Override
    public void createApple(Apple a){
        this.a = a;
    }
}
