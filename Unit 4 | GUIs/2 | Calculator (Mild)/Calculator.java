import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author 
 */
public class Calculator implements Runnable, ActionListener{

  // Class Variables
  JPanel mainPanel;
  JLabel firstNumber;
  JLabel secondNumber;
  JLabel result;
  JTextField firstTextField;
  JTextField secondTextField;
  JTextField resultText;
  JButton add;
  JButton subtract;
  JButton multiply;
  JButton devide;
  
  


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

    //create the JPanel
    mainPanel = new JPanel();
    //disable the layout helper
    mainPanel.setLayout(null);

    //make all labels
    firstNumber = new JLabel("First Number");
    secondNumber = new JLabel("Second Number");
    result = new JLabel("Result");
    //set their bounds
    firstNumber.setBounds(50, 50, 200, 20);
    secondNumber.setBounds(50, 100, 200, 20);
    result.setBounds(50, 150, 200, 20);

    //make all text fields
    firstTextField = new JTextField();
    secondTextField = new JTextField();
    resultText = new JTextField();

    //make it so that the user can not edit the result text field
    resultText.setEnabled(false);

    //sett all their bounds
    firstTextField.setBounds(200, 50, 200, 20);
    secondTextField.setBounds(200, 100, 200, 20);
    resultText.setBounds(200, 150, 200, 20);

    //create all + - / * buttons and action listeners
    add = new JButton("Add");
    subtract = new JButton("Subtract");
    multiply = new JButton("Mul");
    devide = new JButton("Div");
    
    add.addActionListener(this);
    subtract.addActionListener(this);
    multiply.addActionListener(this);
    devide.addActionListener(this);

    add.setActionCommand("add");
    subtract.setActionCommand("subtract");
    multiply.setActionCommand("multiply");
    devide.setActionCommand("devide");

    //set bounds of all buttons
    add.setBounds(50, 250, 100, 20);
    subtract.setBounds(150, 250, 100, 20);
    multiply.setBounds(250, 250, 100, 20);
    devide.setBounds(350, 250, 100, 20);

    //add all buttons/labels/text to main panel
    mainPanel.add(firstNumber);
    mainPanel.add(secondNumber);
    mainPanel.add(result);
    mainPanel.add(firstTextField);
    mainPanel.add(secondTextField);
    mainPanel.add(resultText);
    mainPanel.add(add);
    mainPanel.add(subtract);
    mainPanel.add(multiply);
    mainPanel.add(devide);

    //add main panel to frame
    frame.add(mainPanel);
  }

  // method called when a button is pressed
  public void actionPerformed(ActionEvent e){
    // get the command from the action
    String command = e.getActionCommand();

    //make the two strings taken from the user and cast them as a double
    double num1 = Double.parseDouble(firstTextField.getText());
    double num2 = Double.parseDouble(secondTextField.getText());

    //if add button than add the two numbers
    if(command.equals("add")){
      resultText.setText(""+(num1+num2));
    }
    //if substract button than substract the two numbers
    else if(command.equals("subtract")){
      resultText.setText(""+(num1-num2));
    }
    //if divide button than divide the two numbers
    else if(command.equals("devide")){
      resultText.setText(""+(num1/num2));
    }
    //if multiply button than multiply the two numbers
    else if(command.equals("multiply")){
      resultText.setText(""+(num1*num2));
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


