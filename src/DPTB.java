// DPTB.java Version 2
// ** WARNING: DO NOT CREATE TOO MANY WINDOWS, OR ELSE YOU MAY HARM YOUR COMPUTER **
// Joshua Byers
// Last Edited on September 25, 2015 around 5:31
// This program recreates its window each time you press 'button'.
//
// Version 1:
//		The button.
// Version 2:
//		Quit button.


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
		
		//When you push 'button':
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//It creates a new window.
				DPTB.main(args);
			}
		});
		
		//Quits the program
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}//main
}//DPTB
