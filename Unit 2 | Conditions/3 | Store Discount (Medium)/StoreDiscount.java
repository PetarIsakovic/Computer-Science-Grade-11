import java.util.Scanner;

class StoreDiscount {
  public static void main(String[] args) {

    //makes scanner object
    Scanner scan = new Scanner(System.in);

    //ask user for how much they spent
    System.out.println("Please enter the amount the customer spent");
    double cost = scan.nextDouble();

    //stores the percent amount they will save
    double amountSaved = 0;

    //checks to see how much they will save
    if(cost >= 0.01 && cost <= 40){
      amountSaved = 10;
    }
    else if(cost >= 40.1 && cost <= 80.00){
      amountSaved = 20;
    }
    else if(cost >= 80.1 && cost <= 120.00){
      amountSaved = 30;
    }
    else{
      amountSaved = 40;
    }

    System.out.println("They will receive " + (int)amountSaved + "% off");
    System.out.println("They will save $" + cost*(amountSaved/100));
    System.out.println("The new total is $" + (cost-cost*(amountSaved/100)));
    
    
  }
}