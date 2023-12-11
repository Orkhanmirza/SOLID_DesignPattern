package solid.l;

public class Kia implements Car{
    private double speed;
    private double time;

    public Kia(double speed, double time) {
        this.speed = speed;
        this.time = time;
    }

    @Override
    public double getDistance() {
        return speed*time;
    }
}
