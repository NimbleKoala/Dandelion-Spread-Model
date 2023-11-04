public class wind {
    private String direction;

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
    }

    public String getDirection() {
        return direction;
    }
}