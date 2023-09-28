package Tests;

import Q2pkg.Fruit;
import Q2pkg.GroceryProductFactory;
import Q2pkg.NoFrillsFactory;

public class Testing {
    public static void main(String[] args) {
        GroceryProductFactory factory = new NoFrillsFactory("No Frills");
        Fruit fruit = factory.createBanana(2.99);
        if (fruit.getPrice() == 2.99) {
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }


        
        
    }
}
