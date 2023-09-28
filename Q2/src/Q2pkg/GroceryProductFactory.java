package Q2pkg;

public abstract class GroceryProductFactory {
    //use to make concrete factories to create Products
    public abstract Fruit createFruit();
    public abstract Veggie createVeggie();
}
