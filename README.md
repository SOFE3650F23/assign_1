# sofe3650u-assignment1

## Authors
Natasha Naorem 100845321
Alina Mathew 100853412
Emily Lai 100825007

## Code Structure

The code structure is as folllows:

```
.
├── src/
│   ├── Q2pkg/
│   │   ├── GroceryProductFactory.java (abstract)
│   │   ├── NoFrillsFactory.java
│   │   └── WalmartFactory.java
│   │   ├── Fruit.java (interface)
│   │   ├── Banana.java
│   │   └── Veggie.java (interface)
│   │   ├── Tomato.java
│   └── TestDriver.java
│   └── NoFrillsPrices.txt
│   └── WalmartPrices.txt
│   └── SoftwareDesignAssignment1.drawio.pdf
├── README.md
```

### Products

- `Fruit.java (interface)` - interface that is to be implemented by more specific fruits (Banana)
- `Veggie.java (interface)` - interface that is to be implemented by more specific veggies (Tomato)
- `Banana.java` - class that implements `Fruit` and represents a banana
- `Veggie.java` - class that implements `Veggie` and represents a tomato

### Factories

- `GroceryProductFactory.java (interface)` - interface factory class that defines abstract methods for creating objects of type `Fruit` or `Veggie`
- `WalmartFactory.java` - concrete factory class that extends `GroceryProductFactory` and returns objects of type `Fruit` and `Veggie` with special Walmart prices
- `NoFrillsFactory.java` - concrete factory class that extends `GroceryProductFactory` and returns objects of type `Fruit` and `Veggie` with special NoFrills prices

### TestDriver

- `TestDriver.java` - class that contains the main method and runs the program. 

The following text files are read by the program:

NoFrillsPrices.txt
WalmartPrices.txt

### Output Examples from TestDriver

```
Created a NoFrills in Oshawa
Price:9.99
Price of Banana:2.99
Tests-----
Test passed
Test passed
Test passed
Test passed
Test passed
Test passed
```
