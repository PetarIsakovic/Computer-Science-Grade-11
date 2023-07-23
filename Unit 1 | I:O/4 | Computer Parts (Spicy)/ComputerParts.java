import java.util.Scanner;

class ComputerParts{
  public static void main(String[] args) {

    //makes scanner object
    Scanner scan = new Scanner(System.in);

    //takes in the amount of chromebook chargers the user want to take in
    System.out.println("How many chromebook chargers?");
    int numOfChargers = scan.nextInt();
    
    //takes in the amount of motherboards the user wants to purchase
    System.out.println("How many motherboards?");
    int numOfMotherboards = scan.nextInt();

    //takes in the amount of mice the user wants to purcahses
    System.out.println("How many mice?");
    int numOfMice = scan.nextInt();

    //calculates the total before tax, taxes and total after tax
    double total = numOfChargers*34.99+numOfMotherboards*127.5+numOfMice*18.0;
    double taxes = total*0.13;
    double newTotal = total + taxes;

    //outputs all totals and taxes to the screen
    System.out.printf("Subtotal = $%.2f", total); 
    System.out.printf("\nTaxes = $%.2f", taxes);
    System.out.printf("\nTotal = $%.2f", newTotal);

    
  }
}