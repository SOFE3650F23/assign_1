package Q2pkg;

public abstract class GroceryProductFactory {
    //use to make concrete factories to create Fruit or Veggie Products
    public abstract Fruit createBanana(Double price);
    public abstract Veggie createTomato(Double price);
}
