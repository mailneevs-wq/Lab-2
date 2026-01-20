package labs.lab2;

public class Boat {
    private double x;
    private double y;
    private double direction;

    public Boat(double x, double y, double direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void move(double distance) {
        double radians = Math.toRadians(direction);
        x += distance * Math.cos(radians);
        y += distance * Math.sin(radians);
    }

    public void turn(double angle) {
        direction += angle;
    }

    public double getX() { return x; }
    public double getY() { return y; }
    public double getDirection() { return direction; }
}
