import java.util.Scanner;

class IsItPrime {
  public static void main(String[] args) {

    //makes Scanner object
    Scanner scan = new Scanner(System.in);

    //asks user for input
    System.out.println("Which number would you like to check?");
    int number = scan.nextInt();

    //creates two variables less than 2
    int num1 = 2;
    int num2 = 2;

    boolean primeNumber = true;

    //loops from num1 to number
    while(num1 < number){
      //loops from num2 to number
      while(num2 < number){
        //checks if num1 * num2 is equal to input
        if(num1 * num2 == number){
          //not a prime number
          primeNumber = false;
          break;
        }
        num2++;
      }
      //resets the num2 variable to equal to its original value
      num2 = 2;
      if(!primeNumber){
        break;
      }
      num1++;
    }

    //outputs if the number is prime or not
    if(primeNumber){
      System.out.println(number + " is a prime number");
    }
    else{
      System.out.println(number + " is not a prime number");
    }

    
  }
}