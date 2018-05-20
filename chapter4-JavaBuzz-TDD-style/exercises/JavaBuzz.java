public class JavaBuzz {
  public static String gameLogic(Integer i) {
    if (i % 15 == 0) {
      return "javabuzz";
    } if (i % 5 == 0) {
      return "buzz";
    } if (i % 3 == 0) {
      return "java";
    } else {
      return Integer.toString(i);
    }
  }
  
  public static void main(String[] args) {
     for (int i = 1; i <= 100; i++) {
       String result = gameLogic(i);
       System.out.println(result);
     }
  }
}

