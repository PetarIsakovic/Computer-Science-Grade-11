import java.util.Scanner;

class FizzBuzz {
  public static void main(String[] args) {

    //makes scanner object
    Scanner scan = new Scanner(System.in);

    //asks the user for a positive umber
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    int num = scan.nextInt();

    //loops through all numbers from 1 - input
    int fizzBuzzNumber = 1;
    while(fizzBuzzNumber <= num){

      //checks if the number if Fizz, Buzz, FizzBuzz or none
      if(fizzBuzzNumber % 3 == 0 && fizzBuzzNumber % 5 == 0){
        System.out.println("FizzBuzz");
      }
      else if(fizzBuzzNumber % 3 == 0){
        System.out.println("Fizz");
      }
      else if(fizzBuzzNumber % 5 == 0){
        System.out.println("Buzz");
      }
      else{
        System.out.println(fizzBuzzNumber);
      }
      fizzBuzzNumber++;
    }
    
  }
}