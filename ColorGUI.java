//**********************************************************************
//  ColorGUI.java
// 
//  Represents the user interface for the ColorOptions program that lets
//  the user change background color by selecting a radio button.
// *************************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorGUI
{
    private final int WIDTH = 350, HEIGHT = 100, FONT_SIZE = 20;
    private final int NUM_COLORS = 5;
    private JPanel primary;
    private Color [] color = new Color[NUM_COLORS];
    private JLabel heading;
    
    private JRadioButton[] colorButtons = new JRadioButton[5];

    // ------------------------------------------------------------------
    //  Sets up a GUI with a label at the top and a set of radio buttons
    //  that control the background color of the panel.
    // ------------------------------------------------------------------
    public ColorGUI ()
    {
	// Set up heading and colors
	heading = new JLabel ("Choose the background color!");
	heading.setFont (new Font ("Helvetica", Font.BOLD, FONT_SIZE));

	color[0] = Color.yellow;
	color[1] = Color.cyan;
	color[2] = Color.red;
	color[3] = Color.green;
	color[4] = Color.magenta;
	
	JRadioButton radioButton1 =new JRadioButton("Yellow", true);
	JRadioButton radioButton2 =new JRadioButton("Cyan");
	JRadioButton radioButton3 =new JRadioButton("Red");
	JRadioButton radioButton4 =new JRadioButton("Green");
	JRadioButton radioButton5 =new JRadioButton("Magenta");
	
	ButtonGroup group = new ButtonGroup();
	
	colorButtons[0] = radioButton1;
	colorButtons[1] = radioButton2;
	colorButtons[2] = radioButton3;
	colorButtons[3] = radioButton4;
	colorButtons[4] = radioButton5;

	ColorListener colorListener = new ColorListener();
	
	//Initializing each button
	for(int i = 0; i < colorButtons.length; i++){
		colorButtons[i].setBackground(Color.white);
		colorButtons[i].addActionListener(colorListener);
		group.add(colorButtons[i]);
	}

	// Set up the panel
	primary = new JPanel ();
	primary.add (heading);
	primary.setBackground (Color.yellow);
	
	//Adding each JRadioButtont to the panel
	for(int i = 0; i < colorButtons.length; i++){
		primary.add(colorButtons[i]);
	}
	
	primary.setPreferredSize (new Dimension (WIDTH, HEIGHT));

     
    }


    // --------------------------------------------------------------
    //  Returns the primary panel containing the GUI.
    // --------------------------------------------------------------
    public JPanel getPanel()
    {
	return primary;
    }
    

    // **************************************************************
    //   Represents the listener for the radio buttons.
    // **************************************************************
    private class ColorListener implements ActionListener{
		// --------------------------------------------------------
		//  Updates the background color of the panel based on
		//  which radio button is selected.
		// --------------------------------------------------------
		public void actionPerformed (ActionEvent event){
			//Goes through each button, if it's selected,
			//set the background color to the associated color
			for(int i = 0; i < colorButtons.length; i++){
				if(colorButtons[i].isSelected()){
					primary.setBackground(color[i]);
				}
			}
		}
    }

}

