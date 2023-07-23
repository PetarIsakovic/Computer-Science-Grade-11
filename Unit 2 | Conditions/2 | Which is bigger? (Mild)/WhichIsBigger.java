import java.util.Scanner;

class WhichIsBigger {
  public static void main(String[] args) {

    //make scanner object
    Scanner scan = new Scanner(System.in);

    //ask user for 2 numbers
    System.out.println("Please enter an integer:");
    int a = scan.nextInt();
    System.out.println("Please enter another integer:");
    int b = scan.nextInt();

    //checks which number is bigger or if the numbers are equal
    if(a > b){
      System.out.println("Your numbers in ascending order are " + b + ", " + a);
    }
    else if(a < b){
      System.out.println("Your numbers in ascending order are " + a + ", " + b);
    }
    else{
      System.out.println("Your numbers are equal");
    }
    
  }
}