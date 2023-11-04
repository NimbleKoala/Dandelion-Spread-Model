
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Model {
    public static void main(String[] args) {
        // for (int z = 0; z < 10; z++) {
        int population = 1;
        int timeSinceRain = 5;
        dandelion[][] field = new dandelion[2000][2000];
        field[1000][1000] = new dandelion(365, "seeding", 250, (int) (Math.random() * 3) + 4);
        for (int h = 0; h < 730; h++) {
            if (Math.random() < 0.2) {
                timeSinceRain = 0;
            }
            wind win = new wind();
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    if (field[i][j] != null) {
                        field[i][j].increaseAge();
                        field[i][j].increaseTimeSince();
                        if (field[i][j].getTimeSince() > 150 && (field[i][j].getAge() > 365 || Math.random() < 0.05)
                                && h % 365 < 182) {
                            field[i][j].setSeeds(250);
                        }
                        if (field[i][j].getSeeds() > 0 && timeSinceRain > 1) {
                            win.generateDistance();
                            for (int k = 0; k < field[i][j].getSeeds() * field[i][j].getHeads(); k++) {
                                if (Math.random() < 0.03) {
                                    int b = i + win.getX();
                                    int c = j + win.getY();
                                    if (b < 2000 && c < 2000 && c >= 0 && b >= 0 && field[b][c] == null) {
                                        field[b][c] = new dandelion();
                                        population++;
                                    }
                                }
                            }
                            field[i][j].setTimeSince(0);
                            field[i][j].setSeeds(0);
                        }
                    }
                }
                timeSinceRain++;
            }
            System.out.println(population);
        }

        // }

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
