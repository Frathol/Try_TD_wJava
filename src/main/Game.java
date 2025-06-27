package main;

import javax.swing.JFrame; // Used for making GUI (Got the title, border, size etc can be changed, can add buttons, textfields, etc....)

public class Game extends JFrame {
    public Game() {
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Game game = new Game();
    }
}
