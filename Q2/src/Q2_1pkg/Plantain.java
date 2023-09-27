package Q2_1pkg;

public class Plantain implements Banana {
    //use to create concrete Banana
    String type;
    double price;

    Plantain(String t){
        type = t;
        price = 3;
    }

    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
}
