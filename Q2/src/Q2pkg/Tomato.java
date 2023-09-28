package Q2pkg;

public class Tomato implements Veggie{
    public final String name = "Tomato";
    double price;

    Tomato(double p){
        price = p;
    }

    public double getPrice(){
        return price;
    }
}
