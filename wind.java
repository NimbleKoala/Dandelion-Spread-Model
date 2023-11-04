public class wind {
    private double angle;
    private double distance;

    public wind() {
        angle = Math.random() * 360;
    }

    public void generateDistance() {
        double a = Math.random();
        if (a > 0.05) {
            this.distance = Math.random() * 200;
        } else if (a > 0.006) {
            this.distance = Math.random() * 1800 + 200;
        }
    }

    public int getX() {
        return (int) (this.distance * Math.cos(this.angle) + (Math.random() * 40 - 20) + 0.5);
    }

    public int getY() {
        return (int) (this.distance * Math.sin(this.angle) + (Math.random() * 40 - 20) + 0.5);
    }
}