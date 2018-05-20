import java.util.Scanner;

public class ControlFlow {
  public static void isEven(Integer i) {
    if (i % 2 == 0 ) {
      System.out.println("number is even!");
    } else {
      System.out.println("number is not even!");
    }
  }
  
  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    String s = "";

    while(!s.equals("17")) {
      s = in.nextLine();
      int input = Integer.parseInt(s);
      isEven(input);
    }
  }
}

