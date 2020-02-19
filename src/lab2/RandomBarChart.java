package lab2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Alexander Garcia, Sarai Alvarez, Nicole Perey, Andro Yono
 *
 */

public class RandomBarChart implements ActionListener {

	private JFrame frame;
	private JPanel topPanel;
	private JPanel bottomPanel;
	private JButton button;

	public RandomBarChart() {
		gui();
	}

	public void gui() {
		frame = new JFrame("Random Bar Chart");
		frame.setSize(425, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		topPanel = new JPanel(new BorderLayout());
		topPanel.setBackground(new Color(136, 136, 136));
		
		BarChartPanel barChartPanel = new BarChartPanel();
		topPanel.add(barChartPanel);
		
		bottomPanel = new JPanel(new BorderLayout());
		bottomPanel.setBackground(new Color(51, 51, 51));

		button = new JButton("Redraw");
		button.setPreferredSize(new Dimension(0, 50));
		button.addActionListener(this);

		bottomPanel.add(button);

		frame.add(topPanel);
		frame.add(bottomPanel, BorderLayout.SOUTH);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			topPanel.removeAll();
			
			BarChartPanel barChartPanel = new BarChartPanel();
			topPanel.add(barChartPanel);
			
			topPanel.revalidate();
		}
	}

	public static void main(String[] args) {
		new RandomBarChart();
	}

}
