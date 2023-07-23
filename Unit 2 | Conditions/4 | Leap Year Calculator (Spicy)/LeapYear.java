import java.util.Scanner;

class LeapYear {
  public static void main(String[] args) {

    //makes a scanner object
    Scanner scan = new Scanner(System.in);

    //asks the user for a date
    System.out.println("Please enter a date to determine if it is a leap year or not");
    int year = scan.nextInt();

    //check if the date is a leap year
    if(year % 4 == 0){
      if(year % 100 != 0){
        System.out.println(year + " is a leap year");
      }
      else{
        if(year % 400 != 0){
            System.out.println(year + " is not a leap year");
        }
        else{
          System.out.println(year + " is a leap year");
        }
      }
    }
    else{
      System.out.println(year + " is not a leap year");
    }

    
  }
}