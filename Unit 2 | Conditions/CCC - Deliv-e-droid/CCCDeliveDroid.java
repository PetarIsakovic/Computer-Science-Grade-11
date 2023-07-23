import java.util.Scanner;

class CCCDeliveDroid {
  public static void main(String[] args) {
    //make scanner
    Scanner scan = new Scanner(System.in);

    //get num of packages delivered and amount of collusion
    int packages = scan.nextInt();
    int collision = scan.nextInt();

    //check if the amount of packages deleivered is greater than the amount of collisions to give the bounous 500 points
    if(packages > collision){
      System.out.println(packages*50 - collision*10 + 500);
    }
    else{
      System.out.println(packages*50 - collision*10);
    }
  }
}