import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author
 */
public class TempConversionAgain implements Runnable, ActionListener {

  // Class Variables
  JPanel mainPanel;
  JLabel farenLabel;
  JLabel celciusLabel;
  JTextField farenText;
  JTextField celciusText;
  JButton farenToCelcius;
  JButton celciusToFaren;

  // Method to assemble our GUI
  public void run() {
    // Creates a JFrame that is 800 pixels by 600 pixels, and closes when you click
    // on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800, 600);
    // shows the window
    frame.setVisible(true);

    //makes main panel
    mainPanel = new JPanel();
    //sets layout to null
    mainPanel.setLayout(null);

    //intializes JLabel for F and C
    farenLabel = new JLabel("Degrees Farenheit");
    celciusLabel = new JLabel("Degrees Celcius");

    //sets bounds of JLabel
    farenLabel.setBounds(50, 50, 200, 20);
    celciusLabel.setBounds(50, 100, 200, 20);

    //adds both the labels to the main panel
    mainPanel.add(farenLabel);
    mainPanel.add(celciusLabel);

    //initializes the JTextField for F and C
    farenText = new JTextField();
    celciusText = new JTextField();

    //sets their bounds
    farenText.setBounds(200, 50, 100, 20);
    celciusText.setBounds(200, 100, 100, 20);

    //adds it to the main panel
    mainPanel.add(farenText);
    mainPanel.add(celciusText);

    //initalizes the buttons for F and C
    farenToCelcius = new JButton("F --> C");
    celciusToFaren = new JButton("C --> F");

    //sets the bounds for F and C
    farenToCelcius.setBounds(350, 50, 100, 20);
    celciusToFaren.setBounds(350, 100, 100, 20);

    //adds the action listeners for both the buttons
    farenToCelcius.addActionListener(this);
    celciusToFaren.addActionListener(this);

    //sets the action command for F and C buttons
    farenToCelcius.setActionCommand("fToC");
    celciusToFaren.setActionCommand("CToF");

    //adds the buttons to the main panel
    mainPanel.add(farenToCelcius);
    mainPanel.add(celciusToFaren);

    //adds the main panel to the frame
    frame.add(mainPanel);

  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e) {
    // get the command from the action
    String command = e.getActionCommand();

    //checks if the farenToCelcius button was clicked
    if(command.equals("fToC")){
      //gets the input from the farenText
      double faren = Double.parseDouble(farenText.getText());
      //calculates the celcius degrees from faren
      faren = (faren - 32) * (5.0/9.0); 
      //rounds to the 2nd decimal places
      String f = String.format("%.2f", faren);
      //updates the celcius display value
      celciusText.setText("" + Double.parseDouble(f));
    }
      //checks if the celciusToFaren button was clicked
    else if(command.equals("CToF")){
      //gets the celcius input from the celciusText
      double celcius = Double.parseDouble(celciusText.getText());
      //updates celcius to equal to farenheight
      celcius = (celcius * 9.0/5.0) + 32;
      //reduces to the 2nd decimal place
      String c = String.format("%.2f", celcius);
      //updates the Farentext to the new value
      farenText.setText("" + Double.parseDouble(c));
    }

  }

  // Main method to start our program
  public static void main(String[] args) {
    // Creates an instance of our program
    Main gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}
