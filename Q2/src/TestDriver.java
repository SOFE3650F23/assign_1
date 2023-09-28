import Q2pkg.*; 

public class TestDriver {
    public static void main(String[] args) throws Exception {
        NoFrills oshawaNoFrills = new NoFrills("Oshawa");
        System.out.println("Created a NoFrills in " + oshawaNoFrills.location);
    }
}