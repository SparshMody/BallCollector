import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.geom.AffineTransform;

public class Score {
	private AffineTransform tx;
	private int score;
	private int x=400;
	private int y=400;
	Circle c = new Circle((int)(Math.random()*401) + 100, -100);
	hoop h = new hoop();
	
	public Score(){
		tx = AffineTransform.getTranslateInstance(0, 0);
		init(0,0);
		score =0;
	
		
		
	}
	
	private void init(double i, double j) {
		tx.setToTranslation(i, j);// TODO Auto-generated method stub
		tx.scale(.5, .5);
	}

public void paint(Graphics g) {
	Graphics2D g2 =(Graphics2D)g;
	
	g2.drawString(score + " ", x, y);
score ++;
	init(x,y);
	if(Rectangle.intersects(h.getRect(), c.getRect())) {
			score++;
		
	}


	}
}
//we created a new score counter class that when updated, it should have updated the score by painting it on screen 
//then we tried putting it into the frame class and trying to get it to paint again by creating methods and instance variables
//in the j panel we tried creatinbg a new object of score counter and the necessary code to print the score conter
//howeever it didnt [rint onto the screen so we reset as there were no errors but nothing changed either
// so we have the scire being able to print onto the screen but is unable to paint the updated score that appears in the console log


// problem with the if statement, we got score toprint and increase but due to the score ++ outside of the if statement, if statement does not work as intended
//