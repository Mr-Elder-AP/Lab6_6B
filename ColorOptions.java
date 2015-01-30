// **********************************************************************
//   ColorOptions.java
//
//   Uses an array of radio buttons to change the background color.
// **********************************************************************

import javax.swing.*;

public class ColorOptions
{
    // -------------------------------------------------------------
    //  Creates and presents the frame for the color change GUI.
    // -------------------------------------------------------------
    public static void main (String[] args)
	{
	    JFrame colorFrame = new JFrame ("Color Options");
	    colorFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

	    ColorGUI gui = new ColorGUI();
	    colorFrame.getContentPane().add (gui.getPanel());

	    colorFrame.pack();
	    colorFrame.show();
	}
}

 
