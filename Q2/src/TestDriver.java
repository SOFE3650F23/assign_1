import java.util.ArrayList;
import java.util.List;

import Q2pkg.*; 

public class TestDriver {
    public static void main(String[] args) throws Exception {
        NoFrills oshawaNoFrills = new NoFrills("Oshawa");
        System.out.println("Created a NoFrills in " + oshawaNoFrills.location);

        //add stock of all products
        List<Object> stock = new ArrayList<Object>(); //list of stock of products
        stock.add(oshawaNoFrills.createBanana());
        stock.add(oshawaNoFrills.createApple());
    }
}