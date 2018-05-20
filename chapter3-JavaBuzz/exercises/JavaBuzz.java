// can you remember how to set up your main function?
public class JavaBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      if (i % 15 == 0) {
        System.out.println("JavaBuzz");
      } if ( i % 5 == 0 ) {
        System.out.println("Buzz");
      } if ( i % 3 == 0 ) {
        System.out.println("Java");
      } else {
        System.out.println(i);
      }
    }
  }
}

