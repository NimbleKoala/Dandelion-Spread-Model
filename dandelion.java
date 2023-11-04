public class dandelion {
    private int age;
    private String stage;
    private int seeds;
    private int heads;
    private int timeSince;

    public dandelion() {
        age = 0;
        stage = "seed";
        seeds = 0;
        heads = (int) (Math.random() * 3) + 4;
        timeSince = 0;
    }

    public dandelion(int a, String b, int c, int d) {
        age = a;
        stage = b;
        seeds = c;
        heads = d;
        timeSince = 0;
    }

    public void increaseAge() {
        this.age++;
    }

    public int getAge() {
        return this.age;
    }

    public int getSeeds() {
        return this.seeds;
    }

    public void setSeeds(int a) {
        this.seeds = a;
    }

    public int getTimeSince() {
        return timeSince;
    }

    public void increaseTimeSince() {
        this.timeSince++;
    }

    public void setTimeSince(int a) {
        timeSince = a;
    }

    public int getHeads() {
        return this.heads;
    }
}
