import java.util.Scanner;

class EvenOrOdd {
  public static void main(String[] args) {

    //make scanner
    Scanner scan = new Scanner(System.in);

    //ask user for input and get it
    System.out.println("Please enter an integer:");
    int num = scan.nextInt();

    //if even tell user its even if odd tell user its odd
    if(num % 2 == 0){
      System.out.println(num + " is an even number");
    }
    else{
      System.out.println(num + " is an odd number");
    }
    
  }
}