package game;

import java.awt.Graphics2D;
import java.awt.Shape;

public abstract class GameShape implements Shape {
	protected int x, y;
	
	public int getX() { return x; }
	public int getY() { return y; } 
	
	public abstract void draw(Graphics2D g);
}
