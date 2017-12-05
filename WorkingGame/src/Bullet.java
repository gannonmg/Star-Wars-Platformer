import java.awt.*;

import javax.swing.ImageIcon;
public class Bullet {

	int x,y;
	Image img;
	boolean see = true;
	private Rectangle collisionBox;
	
	public Bullet(int beginX, int beginY)
	{
		x = beginX;
		y = beginY;
		ImageIcon aBullet = new ImageIcon("laserShot.png");
		img = aBullet.getImage();
		see = true;
		collisionBox = new Rectangle(beginX, beginY, 52, 12);
	}
	
	public void move()
	{
		x = x + 10;
		collisionBox.setLocation(x, y);
		if (x > GameFrame.WIDTH)
			see = false;
	}
	
	public Rectangle getCollisionBox(){
		return collisionBox;
	}
}
