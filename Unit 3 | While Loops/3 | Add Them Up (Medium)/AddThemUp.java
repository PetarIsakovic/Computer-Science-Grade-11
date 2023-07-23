import java.util.Scanner;

class AddThemUp {
  public static void main(String[] args) {

    //makes scanner object
    Scanner scan = new Scanner(System.in);

    //asks user for input
    System.out.println("Please enter an integer to add up to");
    int num = scan.nextInt();

    //makes an variable to hold the num data because num will be modified
    final int numHolder = num;

    //creates a total variable
    int total = 0;

    //loops through all numbers from input to one adding all numbers to the total variable
    while(num >= 1){
      total += num;
      num--;
    }
    
    //outputs answer
    System.out.println("The sum from 1 - " + numHolder + " is " + total);
    
  }
}