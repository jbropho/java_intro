import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class JavaBuzzTest {
  JavaBuzz javabuzz;

  @Before public void setUp() {
    javabuzz = new JavaBuzz();
  }

  @Test public void returnsBuzzForMultiple5() {
    String answer = javabuzz.gameLogic(5);
    assertEquals(answer, "buzz");
  }

  @Test public void returnsJavaForMultiple3() {
    String answer = javabuzz.gameLogic(3);
    assertEquals(answer, "java");
  }

  @Test public void returnsJavaBuzzForMultiple15() {
    String answer = javabuzz.gameLogic(15);
    assertEquals(answer, "javabuzz");
  }
}