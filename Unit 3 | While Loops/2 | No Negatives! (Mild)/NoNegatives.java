import java.util.Scanner;

class NoNegatives {
  public static void main(String[] args) {

    //makes scanner object
    Scanner scan = new Scanner(System.in);

    //creates a variable
    int num = 0;

    //keeps checking if the variable above is a positive number
    while(num >= 0){
      //asks the user to update the variable
    System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
      num = scan.nextInt();
    }

    //program is finnished
    System.out.println("All done!");
  
  }
}