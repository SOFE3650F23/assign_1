package Q2pkg;

public class Tomato implements Veggie{
    public final String name = "Tomato";
    Double price;

    Tomato(Double p){
        price = p;
    }

    public Double getPrice(){
        return price;
    }
}
