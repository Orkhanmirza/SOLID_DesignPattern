package solid.l;

public class BMW implements Car {

    private double speed;
    private double time;

    public BMW(double speed, double time) {
        this.speed = speed;
        this.time = time;
    }

    @Override
    public double getDistance() {
        return speed*time;
    }
}
