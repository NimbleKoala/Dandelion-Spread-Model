public class Model {
    public static void main(String[] args) {
        int population = 1;
        dandelion[][] field = new dandelion[2000][2000];
        field[1000][1000] = new dandelion();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] != null) {
                    field[i][j].increaseAge();
                    if ()
                }
            }
        }
        System.out.println(field[1000][1000].getAge());
    }

}
