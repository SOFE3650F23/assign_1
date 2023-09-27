package Q2_1pkg;

public class RedApple implements Apple {
    //use to create concrete Apple
    String type;
    double price;

    RedApple(String t){
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
