package ui;


import game.Ball;
import game.Paddle;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.Timer;

import ui.MainUI;

public class MainUI extends JFrame {
	int x = 100, y = 150;
	Paddle p1, p2;
	Ball ball;
	int vBallX = 3, vBallY = 3;
	int vPaddle = 2;
	
	public MainUI() {
		setBounds(new java.awt.Rectangle(50, 50, 500, 500));
		Timer tm = new Timer(30, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				x += 3;
				y += 3;
				MainUI.this.repaint();
			}
		});
		tm.setInitialDelay(500);
		tm.start();
		
		this.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				if (arg0.getKeyChar() == 'a')
					p1.incr(-vPaddle);
				else if (arg0.getKeyChar() == 'z')
					p1.incr(vPaddle);
				else if (arg0.getKeyCode() == KeyEvent.VK_UP)
					p2.incr(-vPaddle);
				else if (arg0.getKeyCode() == KeyEvent.VK_DOWN)
					p2.incr(vPaddle);
			}

			@Override
			public void keyReleased(KeyEvent arg0) {}

			@Override
			public void keyTyped(KeyEvent arg0) {}
			
		});
		
		p1 = new Paddle(true);
		p2 = new Paddle(false);
		ball = new Ball();
	}

	@Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2 = (Graphics2D)g;
        
        moveShapes(g2);
        drawShapes(g2);
        
    }
	
	private void moveShapes(Graphics2D g2) {
		if (ball.getX() + vBallX < 0 ||
				ball.getX() + vBallX > getBounds().getWidth() - ball.getBounds2D().getHeight() ||
				ball.intersects(p1.getBounds2D()) || ball.intersects(p2.getBounds2D()))
			vBallX = -vBallX;
		if (ball.getY() + vBallY < 0 || ball.getY() + vBallY > getBounds().getHeight())
			vBallY = -vBallY;
		ball.incrX(vBallX);
		ball.incrY(vBallY);
	}

	private void drawShapes(Graphics2D g) {
        p1.draw(g);
        p2.draw(g);
        ball.draw(g);
	}

	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
	}
}
