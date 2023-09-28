package Q2pkg;

public abstract class GroceryProductFactory {
    //use to make concrete factories to create Fruit or Veggie Products
    public abstract Fruit createFruit(String name);
    public abstract Veggie createVeggie(String name);
}
