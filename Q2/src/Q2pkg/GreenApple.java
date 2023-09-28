package Q2pkg;

public class GreenApple implements Apple {
    //use to create concrete Apple
    String type;
    double price;

    GreenApple(String t){
        type = t;
        price = 2.5;
    }

    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
}
