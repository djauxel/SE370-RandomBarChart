package lab2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BarChartPanel extends JPanel {

	public BarChartPanel() {

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// Left padding for first element
		int width = 51;

		// Create the grid pattern
		for (int i = 0; i < 11; i++) {
			// Draw the horizontal line
			g.drawLine(350, width, 51, width);

			// Draw the vertical line
			g.drawLine(width, 51, width, 350);

			// Add padding to create the grid pattern
			width = width + 30;
		}

		Graphics2D g2d = (Graphics2D) g;

		// Default x coordinate
		int x_coordinate = 75;

		// Default y coordinate
		int y_coordinate = 351;

		int bar_width = 10;
		int bar_height;

		for (int i = 0; i < 13; i++) {
			// Randomize the height of the current bar
			bar_height = getRandomHeight();

			// Fill the current bar
			g2d.fillRect(x_coordinate, y_coordinate, bar_width, bar_height);

			// Randomize the color of the current bar
			g2d.setColor(getRandomColor());

			// Add padding to the current bar
			x_coordinate += 20;
		}

	}

	public Color getRandomColor() {
		Random rand = new Random();

		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();

		Color randomColor = new Color(r, g, b);

		return randomColor;
	}

	public int getRandomHeight() {
		Random rand = new Random();
		return -rand.nextInt((299 - 0) + 1) + 0;
	}

}
