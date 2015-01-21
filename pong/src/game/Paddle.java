package game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Paddle extends GameShape {
	private int height = 50, width = 10;
	private Color c = null;
	
	public Paddle(boolean player1) {
		x = (player1) ? 30 : 460;
		y = 225;
		c = (player1) ? Color.BLACK : Color.RED;
	}
	
	public void draw(Graphics2D g) {
		Color curr = g.getColor();
		g.setColor(c);
		g.fill(new Rectangle2D.Double(x, y, width, height));
		g.setColor(curr);
	}
	
	public void incr(int i) { y += i; }
	
	@Override
	public boolean contains(Point2D arg0) {
		return new Rectangle2D.Double(x, y, width, height).contains(arg0);
	}

	@Override
	public boolean contains(Rectangle2D arg0) {
		return new Rectangle2D.Double(x, y, width, height).contains(arg0);
	}

	@Override
	public boolean contains(double arg0, double arg1) {
		Point2D p = new Point2D.Double(arg0, arg1);
		return new Rectangle2D.Double(x, y, width, height).contains(p);
	}

	@Override
	public boolean contains(double arg0, double arg1, double arg2, double arg3) {
		Rectangle2D r = new Rectangle2D.Double(arg0, arg1, arg2, arg3);
		return new Rectangle2D.Double(x, y, width, height).contains(r);
	}

	@Override
	public Rectangle getBounds() {
		return new Rectangle(x,  y, width, height);
	}

	@Override
	public Rectangle2D getBounds2D() {
		return new Rectangle2D.Double(x,  y, width, height);
	}

	@Override
	public PathIterator getPathIterator(AffineTransform arg0) {
		return null;
	}

	@Override
	public PathIterator getPathIterator(AffineTransform arg0, double arg1) {
		return null;
	}

	@Override
	public boolean intersects(Rectangle2D arg0) {
		return new Rectangle2D.Double(x,  y, width, height).intersects(arg0);
	}

	@Override
	public boolean intersects(double arg0, double arg1, double arg2, double arg3) {
		return new Rectangle2D.Double(x,  y, width, height).intersects(arg0, arg1, arg2, arg3);
	}
}
