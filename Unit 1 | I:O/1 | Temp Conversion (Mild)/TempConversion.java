import java.util.Scanner;

class TempConversion {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); // makes scanner
    System.out.println("Please enter a temperature in degrees Celsius you would like to convert to Fahrenheit."); //prints to consol
    int cel = scan.nextInt(); // takes in input
    System.out.println(cel + "C is the same as " + ((cel*9)/5+32) + "F"); // displays output
  }
}


