package Q2pkg;

public class Banana implements Fruit{
    public final String name = "Banana";
    double price;

    Banana(double p){
        price = p;
    }

    public double getPrice(){
        return price;
    }
}
