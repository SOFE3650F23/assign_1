import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import Q2pkg.*; 

public class TestDriver {
    public static void main(String[] args) throws Exception {
    NoFrillsFactory oshawaNoFrills = new NoFrillsFactory("Oshawa");
    System.out.println("Created a NoFrills in " + oshawaNoFrills.location);
    String noFrillsFile = "NoFrillsPrices.txt";

    Veggie noFrillsTomato = oshawaNoFrills.createTomato(PriceReader(noFrillsFile, "tomato"));
    Fruit noFrillsBanana = oshawaNoFrills.createBanana(PriceReader(noFrillsFile, "banana"));

    
    System.out.println("Price:" + noFrillsTomato.getPrice());
    System.out.println("Price of Banana:" + noFrillsBanana.getPrice());

    System.out.println("Tests-----");

    GroceryProductFactory factory = new NoFrillsFactory("No Frills");
        Fruit fruit = factory.createBanana(2.99);
        if (fruit.getPrice() == 2.99) {
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }

    
        if(fruit instanceof Banana) {
            System.out.println("Test passed");
        }

        if(!(fruit instanceof Tomato)) {
            System.out.println("Test passed");
        }

     factory = new WalmartFactory("Walmart");
         fruit = factory.createBanana(12.99);
        if (fruit.getPrice() == 12.99) {
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }

    
        if(fruit instanceof Banana) {
            System.out.println("Test passed");
        }

        if(!(fruit instanceof Tomato)) {
            System.out.println("Test passed");
        }

    }

    //FILE READER METHODS
    public static List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }

    public static Double PriceReader(String path, String name) {
        String filePath = path;
        Double price;

        try {
            List<String> lines = readFile(filePath);
            Boolean found = false;
            for (String line : lines) {
                if(found){
                    try{
                        price = Double.parseDouble(line);
                        return price;
                    } catch(NumberFormatException e){
                        System.err.println("Error converting double");
                        return -1.0;
                    }
                }

                if(line.equalsIgnoreCase(name)){
                    found = true;
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return -1.0;
    }
}
