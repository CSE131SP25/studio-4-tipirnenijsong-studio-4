package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(0.5, 0.5, 0.45, 0.4);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledEllipse(0.5, 0.5, 0.4, 0.2);
		StdDraw.setPenColor(0, 0, 255);
		StdDraw.filledEllipse(0.5, 0.5, 0.2, 0.3);

		
	}
}