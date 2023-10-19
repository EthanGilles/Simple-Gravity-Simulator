package animation;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class MyPanel extends JPanel implements ActionListener {
	
	static final int PANEL_WIDTH = 800; // 800px
	static final int PANEL_HEIGHT = 800; // 800px
	final int INTERVAL = 1; // 1 ms interval
	final int PARTICLE_SIZE = 5; // width 5, height 5
	
	ArrayList<Particle[]> allParticles = new ArrayList<Particle[]>();
	
	/*
	 * To display a particle array color, just add it to allParticles
	 * If you want a different color make a new array 
	 * These colors are the ones I found to 
	 */
	
	Particle[] red;
	Particle[] green;
	Particle[] blue;
	Particle[] yellow;
	
	Timer timer;
	
	
	MyPanel() {
		this.setPreferredSize(new Dimension(PANEL_HEIGHT,PANEL_WIDTH));
		this.setBackground(Color.BLACK);
		
		timer = new Timer(INTERVAL, this);
		timer.start();
		
		green = createParticles(3,Color.GREEN);
		yellow = createParticles(4,Color.YELLOW);
		blue = createParticles(4,Color.CYAN);
		red = createParticles(15,Color.RED);

		
		
		allParticles.add(green);
		
		
	}
	
	
	public static int random() {
		return (int)(Math.random() * PANEL_WIDTH) + 50;
	}
	
	public static Particle[] createParticles(int n, Color c) {
		
		Particle[] temp = new Particle[n];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = new Particle(random(), random(), c);
		}
		return temp;
	}
	
	public static void rule(Particle[] p1, Particle[] p2, double g) {
		for(int i = 0; i < p1.length; i++) {
			double fx = 0;
			double fy = 0;
			
			for(int j = 0; j < p2.length; j++) {
				Particle a = p1[i];
				Particle b = p2[j];
				
				double distanceX = a.x-b.x; // distance between x vals
				double distanceY = a.y-b.y; // distance between y vals
				
				double distance = Math.sqrt((distanceX*distanceX) + (distanceY*distanceY)); // x^2 + y^2 = sqrt(distance)
				
				if(distance > 0 && distance < 80) {
					double force = g * 2 /distance;
					fx += (force * distanceX);
					fy += (force * distanceY);
				}
				a.vx = (a.vx + fx);
				a.vy = (a.vy + fy);
				
				a.x += a.vx;
				a.y += a.vy;
				
				
				if(a.x <= 0)
					a.vx = 1;
				else if(a.x >= PANEL_WIDTH)
					a.vx = -1;
				
				if(a.y <= 0)
					a.vy = 1;
				else if(a.y >= PANEL_HEIGHT)
					a.vy = -1;
				
			}
		}
			
	}
	
	public void paint(Graphics g) { // paints the screen
		super.paint(g);
		Graphics2D g2D = (Graphics2D) g;
		
		rule(green, green, -.5);
		rule(red, red, -.01);
		

		for(Particle[] array : allParticles ) {
			for(int i = 0; i < array.length; i++) {
				Particle p = array[i];
				g2D.setColor(p.color);
				g2D.fillOval(p.x, p.y, PARTICLE_SIZE, PARTICLE_SIZE);
			}
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}
