import java.io.FileWriter;
import java.io.IOException;

public class Model {
    public static void main(String[] args) {
        int population = 1;
        int timeSinceRain = 5;
        dandelion[][] field = new dandelion[2000][2000];
        field[1000][1000] = new dandelion(365, "seeding", 250, (int) (Math.random() * 3) + 4);
        for (int h = 0; h < 1000; h++) {
            if (Math.random() > 0.2) {
                timeSinceRain = 0;
            }
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    if (field[i][j] != null) {
                        field[i][j].increaseAge();
                        field[i][j].increaseTimeSince();
                        if (field[i][j].getTimeSince() > 150 && field[i][j].getAge() > 365 && h % 365 < 182) {
                            field[i][j].setSeeds(250);
                        }
                        if (field[i][j].getSeeds() > 0 && timeSinceRain < 1) {
                            wind a = new wind();
                            if (a.getDirection().equals("North")) {
                                for (int k = 0; k < field[i][j].getSeeds() * field[i][j].getHeads(); k++) {
                                    if (Math.random() < 0.03) {
                                        int b = i + (int) (Math.random() * 200) + (int) (Math.random() * 40 - 20);
                                        int c = j + (int) (Math.random() * 40 - 20);
                                        if (field[b][c] == null) {
                                            field[b][c] = new dandelion();
                                            population++;
                                        }

                                    }
                                }
                            } else if (a.getDirection().equals("South")) {
                                for (int k = 0; k < field[i][j].getSeeds() * field[i][j].getHeads(); k++) {
                                    if (Math.random() < 0.03) {
                                        int b = i + (int) (Math.random() * -200) + (int) (Math.random() * 40 - 20);
                                        int c = j + (int) (Math.random() * 40 - 20);
                                        if (field[b][c] == null) {
                                            field[b][c] = new dandelion();
                                            population++;
                                        }
                                    }
                                }
                            } else if (a.getDirection().equals("West")) {
                                for (int k = 0; k < field[i][j].getSeeds() * field[i][j].getHeads(); k++) {
                                    if (Math.random() < 0.03) {
                                        int b = i + (int) (Math.random() * 40 - 20);
                                        int c = j + (int) (Math.random() * -200) + (int) (Math.random() * 40 - 20);
                                        if (field[b][c] == null) {
                                            field[b][c] = new dandelion();
                                            population++;
                                        }
                                    }
                                }
                            } else if (a.getDirection().equals("East")) {
                                for (int k = 0; k < field[i][j].getSeeds() * field[i][j].getHeads(); k++) {
                                    if (Math.random() < 0.03) {
                                        int b = i + (int) (Math.random() * 40 - 20);
                                        int c = j + (int) (Math.random() * 200) + (int) (Math.random() * 40 - 20);
                                        if (field[b][c] == null) {
                                            field[b][c] = new dandelion();
                                            population++;
                                        }
                                    }
                                }
                            }
                            field[i][j].setTimeSince(0);
                            field[i][j].setSeeds(0);
                        }
                    }
                }
            }
        }
        System.out.println(field[1000][1000].getAge());
        System.out.println(population);
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    if (field[i][j] == null) {
                        myWriter.write("0");
                    } else {
                        myWriter.write("1");
                    }
                }
                myWriter.write(System.getProperty("line.separator"));
            }
            myWriter.close();
        } catch (IOException e) {
        }
    }
}
