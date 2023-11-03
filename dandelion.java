public class dandelion {
    private int age;
    private String stage;
    private int heads;

    public dandelion() {
        age = 0;
        stage = "seed";
    }

    public void increaseAge() {
        this.age++;
    }

    public int getAge() {
        return this.age;
    }
}
