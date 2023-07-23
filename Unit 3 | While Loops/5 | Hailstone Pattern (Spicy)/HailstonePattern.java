import java.util.Scanner;

class HailstonePattern {
  public static void main(String[] args) {

    //makes scanner object
    Scanner scan = new Scanner(System.in);

    //asks user for input
    System.out.println("Please enter a positive integer to see the hailstone sequence.");
    int num = scan.nextInt();

    //outputs the hailstone sequence
    System.out.println("Hailstone sequence is the following:");

    //loops continues until input is no longer 1
    while(num != 1){
      System.out.println(num);
      //changes input if even or if its odd
      if(num % 2 == 0){
        //even
        num/=2;
      }
      else{
        //odd
        num = num*3 + 1;
      }
    }

    //outputs final number (1)
    System.out.println(num);
    
  }
}