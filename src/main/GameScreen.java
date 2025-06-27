package main;

//Container
import javax.swing.JPanel; // Allows to draw the window, can hold its own components

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Random;

public class GameScreen extends JPanel {
    private Random rand;
    private BufferedImage img;
    private ArrayList<BufferedImage> sprites = new ArrayList<>();

    public GameScreen(BufferedImage img) {
        this.img = img;

        loadSprite();

        rand = new Random();
    }

    private void loadSprite() {
        for (int x = 0; x < 10; x++) {
            for (int y = 0; y < 10; y++) {
                sprites.add(img.getSubimage(y * 32, x * 32, 32, 32));
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); /*
                                  * calling the super class JPanel to do all the graphics calculation and drawing
                                  * (background, prev frames, etc..)
                                  */

        // g.drawImage(sprites.get(19), 0, 0, null);
        // imgObserver basicly just check the status when try to draw an image over
        // network
        // g.drawImage(img.getSubimage(32 * 9, 32 * 2, 32, 32), 0, 0, null);

        for (int x = 0; x < 20; x++) {
            for (int y = 0; y < 20; y++) {
                g.drawImage(sprites.get(getRandInt()), y * 32, x * 32, null);
            }
        }

    }

    private int getRandInt() {
        return rand.nextInt(100);
    }

    private Color getRandColor() {
        int r = rand.nextInt(256);
        int g = rand.nextInt(256);
        int b = rand.nextInt(256);

        return new Color(r, g, b);
    }
}