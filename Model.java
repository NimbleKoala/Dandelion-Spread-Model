
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

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
                        if (field[i][j].getTimeSince() > 150 && (field[i][j].getAge() > 365 || Math.random() < 0.001)
                                && h % 365 < 182 && Math.random() < 0.4) {
                            field[i][j].setSeeds(250);
                        }
                        if (field[i][j].getSeeds() > 0 && timeSinceRain < 1) {
                            wind a = new wind();
                            if (a.getDirection().equals("North")) {
                                for (int k = 0; k < field[i][j].getSeeds() * field[i][j].getHeads(); k++) {
                                    if (Math.random() < 0.03) {
                                        int b = i + (int) (Math.random() * 200) + (int) (Math.random() * 40 - 20);
                                        int c = j + (int) (Math.random() * 40 - 20);
                                        if (b < 2000 && c < 2000 && c >= 0 && b >= 0 && field[b][c] == null) {
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
                                        if (b < 2000 && c < 2000 && c >= 0 && b >= 0 && field[b][c] == null) {
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
                                        if (b < 2000 && c < 2000 && c >= 0 && b >= 0 && field[b][c] == null) {
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
                                        if (b < 2000 && c < 2000 && c >= 0 && b >= 0 && field[b][c] == null) {
                                            field[b][c] = new dandelion();
                                            population++;
                                        }
                                    }
                                }
                            } else if (a.getDirection().equals("Northwest")) {
                                for (int k = 0; k < field[i][j].getSeeds() * field[i][j].getHeads(); k++) {
                                    if (Math.random() < 0.03) {
                                        int b = (int) (Math.random() * 200);
                                        int c = i + (int) (Math.sin(45) * b + (Math.random() * 40 - 20));
                                        int d = j + c * -1;
                                        if (c < 2000 && d < 2000 && c >= 0 && d >= 0 && field[c][d] == null) {
                                            field[c][d] = new dandelion();
                                            population++;
                                        }
                                    }
                                }
                            } else if (a.getDirection().equals("Northeast")) {
                                for (int k = 0; k < field[i][j].getSeeds() * field[i][j].getHeads(); k++) {
                                    if (Math.random() < 0.03) {
                                        int b = (int) (Math.random() * 200);
                                        int c = i + (int) (Math.sin(45) * b + (Math.random() * 40 - 20));
                                        int d = j + c;
                                        if (c < 2000 && d < 2000 && c >= 0 && d >= 0 && field[c][d] == null) {
                                            field[c][d] = new dandelion();
                                            population++;
                                        }
                                    }
                                }
                            } else if (a.getDirection().equals("Southwest")) {
                                for (int k = 0; k < field[i][j].getSeeds() * field[i][j].getHeads(); k++) {
                                    if (Math.random() < 0.03) {
                                        int b = (int) (Math.random() * 200);
                                        int c = i + (int) (Math.sin(45) * b + (Math.random() * 40 - 20)) * -1;
                                        int d = j + c;
                                        if (c < 2000 && d < 2000 && c >= 0 && d >= 0 && field[c][d] == null) {
                                            field[c][d] = new dandelion();
                                            population++;
                                        }
                                    }
                                }
                            } else if (a.getDirection().equals("Southeast")) {
                                for (int k = 0; k < field[i][j].getSeeds() * field[i][j].getHeads(); k++) {
                                    if (Math.random() < 0.03) {
                                        int b = (int) (Math.random() * 200);
                                        int c = i + (int) (Math.sin(45) * b + (Math.random() * 40 - 20)) * -1;
                                        int d = j + c * -1;
                                        if (c < 2000 && d < 2000 && c >= 0 && d >= 0 && field[c][d] == null) {
                                            field[c][d] = new dandelion();
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
            BufferedImage bufferedImage = new BufferedImage(2000, 2000,
                    BufferedImage.TYPE_INT_RGB);
            Graphics g2d = bufferedImage.createGraphics();
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    if (field[i][j] == null) {
                        g2d.setColor(Color.white);
                        g2d.fillRect(i, j, i, j);
                    } else {
                        g2d.setColor(Color.black);
                        g2d.fillRect(i, j, i, j);
                    }
                }
            }
            g2d.dispose();
            File file = new File("myimage.png");
            ImageIO.write(bufferedImage, "png", file);
        } catch (IOException e) {
        }

    }
}
