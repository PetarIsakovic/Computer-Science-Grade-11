import java.util.Scanner;

class CalculatingSlope {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in); //makes a scanner
    System.out.println("Please enter in the x coordinate of the first point");//outputs text to screen
    double x1 = scan.nextDouble(); //takes in a double
    System.out.println("Please enter in the y coordinate of the first point");//outputs text to the screen
    double y1 = scan.nextDouble();//takes in a double

    System.out.println("Please enter in the x coordinate of the second point");//outputs text to the screen
    double x2 = scan.nextDouble();//takes in a double
    System.out.println("Please enter in the y coordinate of the second point");//outputs text to the screen
    double y2 = scan.nextDouble();//takes in a double

    //if the user is not dividing by zero it will output answer else it will tell them that there line is straight (undefined slope)
    if(x2-x1 != 0){
      System.out.println("The slope of your line would be " + ((y2-y1)/(x2-x1)));//outputs solution
    }
    else{
      System.out.println("undefined slope");//outputs undefined slope
    }
    
  }
}