//JODALYS HERRERA P7
package jhtree;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class RunnableExample extends Applet implements Runnable {

	int x, y,centerx, centery;
	int counter = 0; 
	int moon;
	public void init() {
		Thread t = new Thread(this);
		t.start();	
		setSize(800,800);
		this.setBackground(Color.cyan);
		x = 450;
		y = 350;
		
	}
	


	public void paint(Graphics g) {
		
		if (countClicks == 0)
			setBackground(Color.black);
			
		g.setColor(Color.yellow);
		g.fillOval(400, 220, 100, 100);
		g.setColor(Color.GRAY);
		g.fillOval(x, y, 100, 100);
		g.setColor(Color.green);
		g.fillRect(0, 700, 800, 100);
		
	}
	
	@Override
	public void run() {
		while (true) {
				counter++;
				double counterInRads = Math.toRadians(counter);
				x = (int) (300 + 300*Math.cos(counterInRads));
				y = (int) (500 + 300*Math.sin(counterInRads));
			repaint();
			try {
				Thread.sleep(22);
			} catch (InterruptedException e) {
				
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
	
}
