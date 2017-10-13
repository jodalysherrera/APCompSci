import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
//Jodalys Herrera & Megan Richards Period 7
public class MyNameProjectJHMR extends Applet {
	public void init () {
	setSize (1000,500);
	setBackground(Color.YELLOW);
	}
	public void paint (Graphics g) {
		g.setColor(Color.gray);
	    g.fillRect(350, 290, 25, 170); //Left down M
	    g.fillRect(350, 280, 180, 30); //Top M
	    g.fillRect(505, 290, 25, 170); //Right down M 
	    g.fillRect(425, 290, 25, 90); //Middle down M 
	    g.fillRect (600,280,25,180); //Back of R 
	    g.fillOval(600, 280, 120, 100); // Semicircle R 
	    g.setColor(Color.YELLOW);
	    g.fillOval(630, 297, 65, 65); //Yellow Middle
	    g.setColor(Color.gray);
	    g.fillRect(600,363,90,30); //horizontal under R
	    g.fillRect(680, 360, 25, 100); 
	    g.fillRect(800, 290, 25, 180); //Vertical E
	    g.fillRect(800, 280, 100, 25); //Top horizontal E
	    g.fillRect(800, 445, 100, 25); // bottom horizontal E
	    g.fillRect(800, 360, 100, 25);







        g.setColor(Color.pink);
        g.fillRect(100,50, 200, 50);
        g.fillRect(175,100, 50,150);
        g.fillRect(70,200, 105,50);
        g.fillRect(475,50, 50,200);
        g.fillRect(475,120, 150, 50);
        g.fillRect(625,50, 50,200);
        g.fillOval(325, 50, 100, 200);
        g.setColor(Color.YELLOW);
        g.fillOval(350, 100, 50, 100);
  
 


	}
}
