import java.util.Scanner;

class CCCQuadrantSection {
  public static void main(String[] args) {
    //make scanner
    Scanner scan = new Scanner(System.in);

    //take in coords
    int x = scan.nextInt();
    int y = scan.nextInt();

    //check which quadrent the coord is in
    if(x >= 0){
      if(y >= 0){
        System.out.println(1);
      }
      else{
        System.out.println(4);
      }
    }
    else{
      if(y >= 0){
        System.out.println(2);
      }
      else{
        System.out.println(3);
      }
    }
  }
}