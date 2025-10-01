package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();

		StdDraw.setCanvasSize(900, 600);
		StdDraw.setPenColor(0, 128, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(.5, .5, .5);
		StdDraw.setPenColor(0, 128, 0);
		StdDraw.filledCircle(.5, .5, .25);
		StdDraw.setPenColor(0, 128, 0);
		StdDraw.setPenRadius(.05);
		StdDraw.circle(.5, .5, .4);
		
	}
}