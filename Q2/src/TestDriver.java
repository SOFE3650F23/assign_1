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

        /*add stock of all products
        List<Object> stock = new ArrayList<Object>(); //list of stock of products
        stock.add(oshawaNoFrills.createVeggie());
        stock.add(oshawaNoFrills.createFruit());*/

    String pathToFile = "NoFrillsPrices.txt";
    String productName = "tomato";

    Double productPrice = PriceReader(pathToFile, productName);

    if(productPrice != -1.0) {
        System.out.println("Price for " + productName + " is: " + productPrice);
    } else {
        System.out.println("Product not found or error reading price.");
    }
        
    }

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