package PKA.VL_07.Pong;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

// Klasse für das Spielfeld
class Spielfeld extends JPanel implements Runnable {
    private int ballX = 100, ballY = 100; // Ballposition
    private int ballSpeedX = 2, ballSpeedY = 2; // Ballgeschwindigkeit
    private int paddleY = 100; // Position des Paddles
    private boolean hoch = false, runter = false; // Paddle-Bewegung

    public Spielfeld() {
        // Tastenlistener hinzufügen
        addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) hoch = true;
                if (e.getKeyCode() == KeyEvent.VK_DOWN) runter = true;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) hoch = false;
                if (e.getKeyCode() == KeyEvent.VK_DOWN) runter = false;
            }

            @Override
            public void keyTyped(KeyEvent e) {}
        });
        setFocusable(true); // Fokus für Tasteneingaben
    }

    @Override
    public void run() {
        while (true) {
            // Ballbewegung
            ballX += ballSpeedX;
            ballY += ballSpeedY;

            // Ballkollision mit Wänden
            if (ballX <= 0 || ballX >= getWidth() - 20) ballSpeedX *= -1;
            if (ballY <= 0 || ballY >= getHeight() - 20) ballSpeedY *= -1;

            // Paddle-Bewegung
            if (hoch && paddleY > 0) paddleY -= 5;
            if (runter && paddleY < getHeight() - 60) paddleY += 5;

            // Aktualisiere das Spielfeld
            repaint();

            try {
                Thread.sleep(10); // Verlangsamt die Spielschleife
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(ballX, ballY, 20, 20); // Zeichnet den Ball
        g.fillRect(20, paddleY, 10, 60); // Zeichnet das Paddle
    }
}

