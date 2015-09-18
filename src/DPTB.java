import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class DPTB {
		
	public static void main(String[] args) {
		JFrame
			window = new JFrame("Don't Push That Button!");//window
		JButton
			button = new JButton("Button"),//Button
			quit = new JButton("Quit");
		
		window.add(button);
		window.add(quit);
		window.setSize(150, 50);
		window.setVisible(true);
		window.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				DPTB.main(args);
			}
		});
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}//main
}//DPTB
