import java.util.Scanner;

class CountDown {
  public static void main(String[] args) {
    //makes scanner object
    Scanner scan = new Scanner(System.in);

    //makes the countdown start from 100
    int countDown = 100;

    //asks the user for a number to countdown to
    System.out.println("Please enter an integer to count down to");
    int lowestNumber = scan.nextInt();

    //counts down by 5 until it reaches the users input
    System.out.println("Count Down:");
    while(countDown >= lowestNumber){
      System.out.println(countDown);
      countDown -= 5;
    }
  }
}