public class helper {
    public String getWindDirection() {
        double a = Math.random();
        if (a < 0.25) {
            return "North";
        } else if (a < 0.5) {
            return "West";
        } else if (a < 0.75) {
            return "South";
        } else {
            return "East";
        }
    }
}