public class wind {
    private String direction;

    public wind() {
        double a = Math.random();
        if (a < 0.125) {
            direction = "North";
        } else if (a < 0.25) {
            direction = "Northwest";
        } else if (a < 0.375) {
            direction = "West";
        } else if (a < 0.5) {
            direction = "Southwest";
        } else if (a < 0.625) {
            direction = "South";
        } else if (a < 0.75) {
            direction = "Southeast";
        } else if (a < 0.875) {
            direction = "East";
        } else {
            direction = "Northeast";
        }
    }

    public String getDirection() {
        return direction;
    }
}