import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author 
 */
public class HelloPerson implements Runnable, ActionListener{

  // Class Variables  
  JPanel mainPanel;
  JLabel helloLabel;
  JTextField nameInput;
  JButton button;


  // Method to assemble our GUI
  public void run(){
    // Creates a JFrame that is 800 pixels by 600 pixels, and closes when you click on the X
    JFrame frame = new JFrame("Title");
    // Makes the X button close the program
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // makes the windows 800 pixel wide by 600 pixels tall
    frame.setSize(800,600);
    // shows the window
    frame.setVisible(true);

    // create the JPanel 
    mainPanel = new JPanel();
    // disable the layout helper
    mainPanel.setLayout(null);

    //make label and set bounds
    helloLabel = new JLabel("Hello __________");
    helloLabel.setBounds(100, 110, 300, 100);

    //make text field and set bounds
    nameInput = new JTextField();
    nameInput.setBounds(100, 100, 100, 20);

    //make button
    button = new JButton("Say Hello");
    button.addActionListener(this);
    button.setActionCommand("hello");
    button.setBounds(200, 200, 100, 20);

    //add button, label and textfield to the main panel
    mainPanel.add(helloLabel);
    mainPanel.add(nameInput);
    mainPanel.add(button);

    //add main panel to frame
    frame.add(mainPanel);
    
    
    
 
    
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    if(command.equals("hello")){

      String name = nameInput.getText();

      helloLabel.setText("Hello " + name);
        
      
      
    }
    

  }

  // Main method to start our program
  public static void main(String[] args){
    // Creates an instance of our program
    Main  gui = new Main();
    // Lets the computer know to start it in the event thread
    SwingUtilities.invokeLater(gui);
  }
}


