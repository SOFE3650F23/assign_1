package Q2_1pkg;

public class NoFrills extends AbstractFactory {
    Banana b;
    Apple a;

    @Override
    public void createBanana(Banana b){
        this.b = b;
    }

    @Override
    public void createApple(Apple a){
        this.a = a;
    }
}
