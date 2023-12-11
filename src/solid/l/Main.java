package solid.l;

public class Main {
    public static void main(String[] args) {
        Car bmw=new BMW(20,2);
        Car kia =new Kia(30,1);
        System.out.println("BMW traveled the distance " +bmw.getDistance()+" km");
        System.out.println("Kia traveled the distance "+kia.getDistance()+" km");
    }
}
