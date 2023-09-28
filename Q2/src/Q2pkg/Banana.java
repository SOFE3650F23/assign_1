package Q2pkg;

public class Banana implements Fruit{
    public final String name = "Banana";
    Double price;

    Banana(Double p){
        price = p;
    }

    public Double getPrice(){
        return price;
    }
}
