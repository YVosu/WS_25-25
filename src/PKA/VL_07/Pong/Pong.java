package PKA.VL_07.Pong;

import javax.swing.*;

public class Pong {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pong");
        Spielfeld spielfeld = new Spielfeld();
        frame.add(spielfeld);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Starte den Spiel-Thread
        Thread spielThread = new Thread(spielfeld);
        spielThread.start();
    }
}
