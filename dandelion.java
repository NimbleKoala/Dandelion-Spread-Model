public class dandelion {
    private int age;
    private String stage;
    private int seeds;
    private int heads;

    public dandelion() {
        age = 0;
        stage = "seed";
        seeds = 0;
    }

    public dandelion(int a, String b, int c) {
        age = a;
        stage = b;
        seeds = c;
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
}
