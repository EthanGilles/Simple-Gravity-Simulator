package animation;

import java.awt.Color;

public class Particle {
	
	int x;
	int y;
	double vx;
	double vy;
	Color color;
	
	public Particle(int x, int y, Color c) {
		this.x = x;
		this.y = y;
		vx = 0;
		vy = 0;
		color = c;
		
		
	}
}
