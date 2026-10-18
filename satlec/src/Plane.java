public class Plane extends Vehicle{
    private int wingSpan;
    private int minRunway;

    public Plane(int wingSpan, int minRunway) {
        this.wingSpan = wingSpan;
        this.minRunway = minRunway;
    }

    public int getWingSpan() {
        return wingSpan;
    }

    public int getMinRunway() {
        return minRunway;
    }

    public void setMinRunway(int minRunway) {
        this.minRunway = minRunway;
    }

    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }
}
