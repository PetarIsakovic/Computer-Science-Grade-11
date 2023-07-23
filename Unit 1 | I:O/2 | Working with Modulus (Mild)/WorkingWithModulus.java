import java.util.Scanner;

class WorkingWithModulus {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);//makes scanner
    System.out.println("Please enter in two integers, on seperate lines, to divide");//prints output
    int num1 = scan.nextInt();//takes in a number
    int num2 = scan.nextInt();//takes in a 2nd number
    System.out.println(num1 + "/" + num2 + " is " + (num1/num2) + " with a remainder of " + (num1%3)); //prints the output
  }
}