public class Model {
    public static void main(String[] args) {
        int population = 1;
        dandelion[][] field = new dandelion[2000][2000];
        field[1000][1000] = new dandelion(365, "seeding", 200);
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j] != null) {
                    field[i][j].increaseAge();
                    if (field[i][j].getSeeds() > 0) {
                        wind a = new wind();
                        System.out.println("A");
                        if (a.getDirection().equals("North")) {
                            for (int k = 0; k < field[i][j].getSeeds(); k++) {
                                if (Math.random() < 0.5) {
                                    population++;
                                    System.out.println("A");
                                    field[i + a.getSpeed() * 20 + (int) (Math.random() * 40 - 20)][j
                                            + (int) (Math.random() * 40 - 20)] = new dandelion();
                                }
                            }
                        } else if (a.getDirection().equals("South")) {
                            for (int k = 0; k < field[i][j].getSeeds(); k++) {
                                if (Math.random() < 0.5) {
                                    population++;
                                    System.out.println("A");
                                    field[i + a.getSpeed() * -20 + (int) (Math.random() * 40 - 20)][j
                                            + (int) (Math.random() * 40 - 20)] = new dandelion();
                                }
                            }
                        } else if (a.getDirection().equals("West")) {
                            for (int k = 0; k < field[i][j].getSeeds(); k++) {
                                if (Math.random() < 0.5) {
                                    population++;
                                    System.out.println("A");
                                    field[i + (int) (Math.random() * 40 - 20)][j
                                            + a.getSpeed() * 20 + (int) (Math.random() * 40 - 20)] = new dandelion();
                                }
                            }
                        } else if (a.getDirection().equals("South")) {
                            for (int k = 0; k < field[i][j].getSeeds(); k++) {
                                if (Math.random() < 0.5) {
                                    population++;
                                    System.out.println("A");
                                    field[i + (int) (Math.random() * 40 - 20)][j
                                            + a.getSpeed() * -20 + (int) (Math.random() * 40 - 20)] = new dandelion();
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(field[1000][1000].getAge());
        System.out.println(population);
    }

}
