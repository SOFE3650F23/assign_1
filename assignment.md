# **Assignment instructions:**

### *Abstract Factory Pattern*
- Way to encapsulate a group of individual factories that have a common theme, without specifying their concrete classes
- Clients use particular product methods in abstract class to create different objects of the product

### *Factory Method Pattern*
- Creates objects without specifying exact class to create

## **Use Case Scenario**

We would like to use an Abstract Factory to create products for a grocery store and at the same time set the price of the product. The price of the product is set after the product is created and is read from a database (in this assignment that database can be file of product names and prices.). For setting the price of the product one can use a Factory Method pattern.


# *Exercise*
1. Create a UML diagram of your design that includes a GroceryProductFactory interface class that is used to implement different grocery product type Factories for Bananas, Apples, etc. For the particular product types take advantage of the Factory Method pattern to set the price of the product based on the amount stored in a data file.
2. Implement the design in Java and include a test driver to demonstrate that the code works using 2 examples of a product such as Bananas and Apples.


# *Deliverables*
- Do all your work in a GitHub repository and submit in Canvas the link to the repository.
    - This repository should contain at least a folder with source files and another for the
test files.
- Create a README.md file for your assignment project.
    -This file should contain a brief description of the structure of your repository (i.e. what the folders contain).
    -Also describe the test methods that you developed and show the execution of these (as screen dumps) in this section of the README file.
