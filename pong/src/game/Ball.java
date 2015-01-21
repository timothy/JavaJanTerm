package game;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;

public class Ball extends GameShape {
	private BufferedImage img = null;
	private int width, height;
	private static Random rnd = new Random();
	
	public Ball() {
        if (img == null) {
	        try {
	            URL url = this.getClass().getClassLoader().getResource("resources/mac.png");    	
	            img = ImageIO.read(url);
	            height = img.getHeight();
	            width = img.getWidth();
	        }
	        catch (Exception ex) {}
        }
        
        x = rnd.nextInt(100) + 200;
        y = rnd.nextInt(500);
	}
	
	public int getX() { return x; }
	public int getY() { return y; }
	public void incrX(int incr) { x += incr; }
	public void incrY(int incr) { y += incr; }
	
	@Override
	public void draw(Graphics2D g) {
        if (img == null) {
	        try {
	            URL url = this.getClass().getClassLoader().getResource("resources/mac.png");    	
	            img = ImageIO.read(url);
	            height = img.getHeight();
	            width = img.getWidth();
	        }
	        catch (Exception ex) {}
        }
        if (img != null)
        	g.drawImage(img, null, x, y);
	}
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
