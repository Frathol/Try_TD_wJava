package main;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame; // Used for making GUI (Got the title, border, size etc can be changed, can add buttons, textfields, etc....)

public class Game extends JFrame {

    private GameScreen gameScreen;
    private BufferedImage img; // extends images, can manipulate spesific pixels, display images.

    public Game() {
        importImg();

        setSize(640, 640);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        gameScreen = new GameScreen(img);
        add(gameScreen); // add the panel to the frame (Like a sticky note added to the board)
    }

    private void importImg() {
        // read the image
        InputStream is = getClass().getResourceAsStream("/res/spriteatlas.png");

        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            System.out.println("Something went wrong\n");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
    }
}
