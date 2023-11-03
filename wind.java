public class wind {
    private String direction;
    private double speed;

    public wind() {
        double a = Math.random();
        if (a < 0.25) {
            direction = "North";
        } else if (a < 0.5) {
            direction = "West";
        } else if (a < 0.75) {
            direction = "South";
        } else {
            direction = "East";
        }
        speed = Math.random() * 23 * 0.44704;
    }

    public String getDirection() {
        return direction;
    }

    public int getSpeed() {
        return (int) speed;
    }
}