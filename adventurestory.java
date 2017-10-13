import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JComponent;
import javax.swing.JFrame;

//JODALYS HERRERA P7

public class adStory extends JComponent implements MouseListener {

	public static String nameOfApp = "Your Adventure!";
	int screen = 0;

	
	public adStory() {
		addMouseListener(this);
	}
	
	public void paint(Graphics g) {

		if (screen==0){

			startingscreen(g);
		}else if (screen==1){

			CAT(g);
		}else if (screen==2){
			DOG(g);
			
		}else if (screen==3){
			doggo(g);
		}
		else if (screen==4){
			puppo(g);
		}
		else if (screen==5){
			beach(g);
		}
		else if (screen==6){
			park(g);
		}
		else if (screen==7){
			surfing(g);
		}
		else if (screen==8){
			boating(g);
		}
		else if (screen==10){
			leave(g);
		}
		else if (screen==9){
			fight(g);
		}
		else if (screen==11){
			camp(g);
		}
		else if (screen==12){
			ask(g);
		}
		else if (screen==13){
			coconuts(g);
		}
		else if (screen==14){
			bananas(g);
		}
		else if (screen==16){
			party(g);
		}
		else if (screen==15){
			sleep(g);
		}
		else if (screen==17){
			befriend(g);
		}
		else if (screen==18){
			hide(g);
		}
		else if (screen==19){
			shore(g);
		}
		else if (screen==20){
			somewhere(g);
		}
		else if (screen==22){
			antartica(g);
		}
		else if (screen==21){
			thailand(g);
		}
		else if (screen==23){
			chillcaps(g);
		}
		else if (screen==24){
			chill(g);
		}
	


	}




	public void startingscreen(Graphics g){

		g.setColor(Color.white);	
		g.drawString("Choose a character!",10,10);
		g.drawString("CAT",10,100);
		g.drawString("DOG",200,100);
	}

	public void CAT (Graphics g){
	g.setColor(Color.white);
	g.drawString("The cat is your not your friend! You lose.", 10, 10);	
	}

public void DOG (Graphics g){

	g.setColor(Color.white);
	g.drawString("The dog is your friend!", 10, 10);	
	g.drawString("What do you want to name the dog?", 10, 100);	
	g.drawString("doggo",10,300);
	g.drawString("puppo",200,300);
	}

private void puppo (Graphics g) {
	g.setColor(Color.white);	
	g.drawString("Rude. That's not his name. He leaves and you lose.",10,10);
	}
	
private void doggo (Graphics g) {
	g.setColor(Color.white);	
	g.drawString("CORRECT! Where do you want to go with Doggo?",10,10);
	g.drawString("park",10,300);
	g.drawString("beach",200,300);	
	}

private void beach (Graphics g) {
	g.setColor(Color.white);	
	g.drawString("Doggo hates that park! You've upset him and he has abandoned you at the park",10,10);
	}
	
private void park (Graphics g) {
	g.setColor(Color.white);	
	g.drawString("Doggo is so happy!! Do you want to go boating or surfing with Doggo?",10,10);
	g.drawString("surfing",10,300);
	g.drawString("boating",200,300);	
	}
private void surfing (Graphics g) {
	g.setColor(Color.white);	
	g.drawString("So y'all go on a surf but turns out you can't swim so you drown :(",10,10);
	}
	
private void boating (Graphics g) {
	g.setColor(Color.white);	
	g.drawString("Doggo is super excited! However, you're out on see and it turns out theres a shark. Do you jump in and fight it or leave to shore?",10,10);
	g.drawString("FIGHT",10,300);
	g.drawString("leave",200,300);	
	}
private void leave (Graphics g) {
	g.setColor(Color.white);	
	g.drawString("Turns out there is more than one shark and they take down you and the boat.",10,10);
	}
private void fight(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("TURNS OUT YOU CAN'T SWIM BUT THE SHARK IS ACTUALLY A DOLPHIN!!",10,10);
	g.drawString("DOLPHIN SAVES YOU AND TAKES YOU AND DOGGO TO A MAGICAL ISLAND",10,20);
	g.drawString("Do you set up camp or ask to be taken to shore?",10,30);
	g.drawString("camp",10,300);
	g.drawString("ask to go to shore",200,300);	
	}

private void ask(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("You've upset the dolphin so he ate you. Bye!",10,10);
	
	}

private void camp(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("You and Doggo make camp and all is good! For dinner do you want coconuts or bananas?",10,10);
	g.drawString("coconuts",10,300);
	g.drawString("bananas",200,300);	
	}

private void bananas(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("You've been poisined... u die.'",10,10);
	}
private void coconuts(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("Y'all ate good. Go to sleep or throw a party?",10,10);
	g.drawString("sleep",10,300);
	g.drawString("party!",200,300);	
	}
private void party(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("You're irresponsible and die from sleep deprivation.",10,10);
    }
private void sleep (Graphics g) {
	g.setColor(Color.white);	
	g.drawString("You wake up and doggo and you are surrounded by monkeys. Do you befriend them or hide?",10,10);
	g.drawString("befriend",10,300);
	g.drawString("hide",200,300);	
	}

private void hide(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("You're not a good hider. The eat u... u die.",10,10);
    }
private void befriend (Graphics g) {
	g.setColor(Color.white);	
	g.drawString("YoOoOoOo they're flying monkeys? Do you fly back to shore or visit somewhere new?",10,10);
	g.drawString("shore",10,300);
	g.drawString("somewhere new",200,300);	
	}
private void shore(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("They drop you in the ocean and u drown.",10,10);
    }
private void somewhere (Graphics g) {
	g.setColor(Color.white);	
	g.drawString("Where do you want to visit?",10,10);
	g.drawString("thailand",10,300);
	g.drawString("antartica",200,300);	
	}
private void antartica(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("Its really cold... u freeze to death",10,10);
    }
private void thailand(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("AYE you find yourself at a beach house with doggo! Do you CHILL or or do you chill?",10,10);
	g.drawString("CHILL",10,300);
	g.drawString("chill",200,300);	
	}

private void chillcaps(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("wow u really ain't chill- doggo abandoned you and found a better person- u die alone",10,10);
    }
private void chill(Graphics g) {
	g.setColor(Color.white);	
	g.drawString("YOU AND DOGGO BECOME BFFS AND LIVE HAPPILY EVER AFTER - THE END!",10,10);
	
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getX()+ " " +e.getY());
		if (screen==0){
			if (e.getX()>10 && e.getX()<100 && e.getY()>270 && e.getY()<310){
				screen=1;
			}
			if (e.getX()>200 && e.getX()<300 && e.getY()>90 && e.getY()<110){
				screen=2;
			}
		
	repaint();
	}else if (screen==2){
		if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
			screen=3;
		}
		if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
				screen=4;
			}	
		
	repaint();
	
	}else if (screen==3){
			if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
				screen=5;
			}
			if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
					screen=6;
				}	
			
		repaint();
		}
	else if (screen==6){
		if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
			screen=7;
		}
		if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
				screen=8;
			}	
		
	repaint();
	}else if (screen==8){
		if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
			screen=9;
		}
		if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
				screen=10;
			}	
		
	repaint();
	}
	else if (screen==9){
		if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
			screen=11;
		}
		if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
				screen=12;
			}	
		
	repaint();
	}
	else if (screen==11){
		if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
			screen=13;
		}
		if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
				screen=14;
			}	
		
	repaint();
	}	
	else if (screen==13){
		if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
			screen=15;
		}
		if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
				screen=16;
			}	
		
	repaint();
	}	
	else if (screen==15){
		if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
			screen=17;
		}
		if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
				screen=18;
			}	
		
	repaint();
	}
	else if (screen==17){
		if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
			screen=19;
		}
		if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
				screen=20;
			}	
		
	repaint();
	}	
	else if (screen==20){
		if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
			screen=21;
		}
		if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
				screen=22;
			}	
		
	repaint();
	}	
	else if (screen==21){
		if (e.getX()>11 && e.getX()<44 && e.getY()>270 && e.getY()<310){
			screen=23;
		}
		if (e.getX()>180 && e.getX()<250 && e.getY()>275 && e.getY()<325){
				screen=24;
			}	
		
	repaint();
	}
}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame(nameOfApp);
		frame.getDefaultCloseOperation();
		frame.add(new adStory());
		frame.setSize(600, 600);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.pink);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
