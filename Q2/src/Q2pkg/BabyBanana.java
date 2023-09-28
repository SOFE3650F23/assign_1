package Q2pkg;

public class BabyBanana implements Banana {
    //use to create concrete Banana
    String type;
    double price;

    BabyBanana(String t){
        type = t;
        price = 2;
    }

    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
}
